package com.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsorted extends LinkedList {
	
	//use hashset to maintain the uniqueness 
	public void removeDuplicates(){
		Node curr = head;
		Node prev = null;
		Set<Integer> set = new HashSet<Integer>();
		while(curr != null){
			if(set.contains(curr.data)){
				prev.next = curr.next;
				curr = curr.next;
			}
			else{
				set.add(curr.data);
				prev = curr;
				curr = curr.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromUnsorted list = new RemoveDuplicatesFromUnsorted();
		list.push(9);
		list.push(3);
		list.push(5);
		list.push(1);
		list.push(5);
		list.push(5);
		list.push(3);
		list.printList();
		list.removeDuplicates();
		list.printList();
	}

}
