package com.ds.linkedlist;

public class Compare2Strings {
	Node head;
	
	class Node{
		char data;
		Node next;
		public Node(char data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(char data){
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(char data){
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
		}
		lastNode.next = new Node(data);
	}
	
	public void printList(){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.data+"\t");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static int compare(Compare2Strings list1, Compare2Strings list2){
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		
		while(curr1 != null && curr2 != null && curr1.data == curr2.data){
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		
		if(curr1 != null && curr2 != null){
			return curr1.data>curr2.data?1:-1;
		}
		
		if(curr1 != null && curr2 ==null){
			return 1;
		}
		
		if(curr2 != null && curr1 == null){
			return -1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Compare2Strings list1 = new Compare2Strings();
		list1.append('a');
		list1.append('b');
		list1.append('c');
		list1.append('d');
		list1.append('e');
		list1.printList();
		
		Compare2Strings list2 = new Compare2Strings();
		list2.append('a');
		list2.append('b');
		list2.append('c');
		list2.append('d');
		list2.append('c');
		list2.printList();
		
		System.out.println(compare(list1,list2));
	}

}
