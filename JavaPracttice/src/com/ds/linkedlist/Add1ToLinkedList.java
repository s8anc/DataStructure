package com.ds.linkedlist;

public class Add1ToLinkedList extends LinkedList {
	
	 int carry = 0;
	
	public void recursiveAdd(Node node){
		if(node == null){
			return;
		}
		recursiveAdd(node.next);
		int sum = 0;
		
		if(node.next == null){
			sum = node.data + 1;
		}
		else{
			sum = node.data + carry;
		}
		carry = sum/10;
		sum = sum%10;
		node.data = sum;
		
		if(node == head && carry ==1){
			Node newNode = new Node(1);
			newNode.next = node;
			head = newNode;
		}
		
	}

	public static void main(String[] args) {
		Add1ToLinkedList list = new Add1ToLinkedList();
		list.append(9);
		list.append(9);
		list.append(9);
		list.append(9);
		list.printList();
		list.recursiveAdd(list.head);
		list.printList();
		
	}

}
