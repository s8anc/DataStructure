package com.ds.linkedlist;

public class MoveLastElementToFront extends LinkedList {
	
	public void moveLastElementToFast(){
		Node lastNode = head;
		Node prev = null;
		while(lastNode.next != null){
			prev = lastNode;
			lastNode = lastNode.next;
		}
		prev.next = null;
		lastNode.next = head.next;
		
		head.next = null;
		prev.next = head;
		
		head = lastNode;
	}
	

	public static void main(String[] args) {
		MoveLastElementToFront list = new MoveLastElementToFront();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.printList();
		list.moveLastElementToFast();
		list.printList();
	}

}
