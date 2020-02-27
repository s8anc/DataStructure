package com.ds.linkedlist;

public class AddTwoNumbers extends LinkedList {
	
	static int carry;
	static AddTwoNumbers result = new AddTwoNumbers();
	
	public static void addNumbers(AddTwoNumbers list1, AddTwoNumbers list2){
		addSameSize(list1.head, list2.head);
		if(carry != 0){
			result.push(carry);
		}
	}
	
	public static void addSameSize(Node node1, Node node2){
		if(node1 == null){
			return;
		}
		addSameSize(node1.next,node2.next);
		
		int sum = node1.data + node2.data+ carry;
		carry = sum/10;
		sum = sum%10;
		
		result.push(sum);
	}

	public static void main(String[] args) {
		AddTwoNumbers list1 = new AddTwoNumbers();
		list1.append(6);
		list1.append(6);
		list1.printList();
		AddTwoNumbers list2 = new AddTwoNumbers();
		list2.append(5);
		list2.append(6);
		list2.printList();
		addNumbers(list1, list2);
		result.printList();
	}

}
