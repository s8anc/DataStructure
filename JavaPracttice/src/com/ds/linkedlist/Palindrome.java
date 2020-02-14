package com.ds.linkedlist;

import java.util.Stack;


public class Palindrome extends LinkedList{
	
	public boolean isPalindrome(){
		if(head == null){
			return false;
		}
		Stack<Integer> st = new Stack<Integer>();
		Node curr = head;
		while(curr != null){
			st.push(curr.data);
			curr = curr.next;
		}
		curr = head;
		while(curr != null){
			if(curr.data != st.pop()){
				return false;
			}
			curr = curr.next;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Palindrome list =new Palindrome();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(2);
		list.push(1);
		list.printList();
		System.out.println("Is palindrome : "+ list.isPalindrome());
	}
}
