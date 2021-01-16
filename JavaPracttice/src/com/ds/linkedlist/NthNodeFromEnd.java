package com.ds.linkedlist;

public class NthNodeFromEnd extends LinkedList{
	
	public int findNthNodefromEnd(int n) throws Exception{
		Node front = head, back = head;
		while(n>1 && front.next != null){
			front = front.next;
			n--;
		}
		
		while(front.next != null){
			front = front.next;
			back = back.next;
		}
		
		return back.data;
	}

	public static void main(String[] args) {
		NthNodeFromEnd list = new NthNodeFromEnd();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.printList();
		try {
			System.out.println(list.findNthNodefromEnd(2));
		} catch (Exception e) {
			e.printStackTrace();
		};
	}

}
