package com.ds.linkedlist;

public class CountNoOfOccurrence extends LinkedList{
	
	private static int counter = 0;
	
	public static int getCountNoOfOccurrence(Node head, int key){
		if(head == null)
			return counter;
		if(head.data == key)
			counter++;
		return getCountNoOfOccurrence(head.next, key);
	}
	
	
	
	public static void main(String[] args) {
		CountNoOfOccurrence list = new CountNoOfOccurrence();
		list.push(5);
		list.push(5);
		list.push(5);
		list.push(59);
		list.printList();
		System.out.println(getCountNoOfOccurrence(list.head, 5));
		
	}

}
