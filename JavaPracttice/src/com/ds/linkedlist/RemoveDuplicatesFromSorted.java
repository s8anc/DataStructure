package com.ds.linkedlist;



public class RemoveDuplicatesFromSorted extends LinkedList{
	
	public void removeDuplicates(){
		Node curr = head;
		Node prev = null;
		while(curr.next != null){
			if(curr.data == curr.next.data){
				if(prev == null){
					head = curr.next;
					curr = head;
					prev = null;
				}
				else{
					prev.next = curr.next;
					curr = prev.next;
				}
			}
			else{
				prev = curr;
				curr = curr.next;
			}
		}
		printList();
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSorted list = new RemoveDuplicatesFromSorted();
		list.append(1);
		list.append(1);
		list.append(1);
		list.append(4);
		list.append(6);
		list.append(9);
		list.append(9);
		list.append(9);
		list.printList();
		list.removeDuplicates();
		
	}
}
