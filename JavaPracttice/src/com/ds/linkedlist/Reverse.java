package com.ds.linkedlist;

public class Reverse extends LinkedList {
	
	public void doReverse(){
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		Reverse list = new Reverse();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.printList();
		list.doReverse();
		list.printList();
	}

}
