package com.ds.linkedlist;

public class PrintReverse extends LinkedList {
	
	//using recursion
	public void printReverse(Node head){
		if(head == null){
			return;
		}
		printReverse(head.next);
		
		System.out.print(head.data+"\t");
	}

	public static void main(String[] args) {
		PrintReverse list = new PrintReverse();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.printList();
		list.printReverse(list.head);
	}

}
