package com.ds.linkedlist;

public class IntersectionPoint extends LinkedList {
	
	public static void findInterSectionNode(IntersectionPoint list1, IntersectionPoint list2){
		int c1 = list1.getNodeCount();
		int c2 = list2.getNodeCount();
		int d = c1-c2;
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		if(d>0){
			while(d>0){
				curr1 = curr1.next;
				d--;
			}
		}
		if(d<0){
			d=Math.abs(d);
			while(d>0){
				curr2 = curr2.next;
				d--;
			}
		}
		
		while(curr1 != null && curr2 != null){
			if(curr1.data == curr2.data){
				System.out.println("Intersection Node found :"+curr1.data);
				return;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		System.out.println("No intersection node found");	
	}
	
	public int getNodeCount(){
		Node curr = head;
		int c = 0;
		while(curr != null){
			c++;
			curr = curr.next;
		}
		return c;
	}

	public static void main(String[] args) {
		IntersectionPoint list1 = new IntersectionPoint();
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		list1.append(5);
		list1.append(6);
		
		IntersectionPoint list2 = new IntersectionPoint();
		list2.append(1);
		list2.append(2);
		
		list2.head.next.next = list1.head.next.next.next.next;
		
		list1.printList();
		list2.printList();
		
		findInterSectionNode(list1, list2);
	}

}
