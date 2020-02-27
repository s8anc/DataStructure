package com.ds.linkedlist;

public class SortLinkedList0s1s2s extends LinkedList {
	
	public void doSort(){
		Node zeroD = new Node(0);
		Node oneD = new Node(0);
		Node twoD = new Node(0);
		
		Node zero = zeroD, one = oneD, two = twoD;
		Node curr = head;
		
		//create 3 diff list
		while(curr != null){
			if(curr.data == 0){
				zero.next = curr;
				zero = zero.next;
			}
			else if(curr.data == 1){
				one.next = curr;
				one = one.next;
			}
			else{
				two.next = curr;
				two = two.next;
			}
			curr = curr.next;
		}
		//create the cons list
		zero.next = oneD.next;
		one.next = twoD.next;
		two.next = null;// important to update the lastnode.next as null
		head = zeroD.next;
		
		
	}

	public static void main(String[] args) {
		SortLinkedList0s1s2s list = new SortLinkedList0s1s2s();
		list.append(1);
		list.append(2);
		list.append(2);
		list.append(0);
		list.append(1);
		list.append(0);
		list.append(2);
		list.append(1);
		list.printList();
		list.doSort();
		list.printList();
	}

}
