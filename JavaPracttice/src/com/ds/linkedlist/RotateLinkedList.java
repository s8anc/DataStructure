package com.ds.linkedlist;

public class RotateLinkedList extends LinkedList {

	public void rotateList(int k){
		Node prev = null, curr = head;
		while(k>0 && curr != null){
			prev = curr;
			curr = curr.next;
			k--;
		}
		
		Node lastNode = head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
		}
		
		prev.next = null;
		lastNode.next = head;
		head = curr;
		
		
	}
	
	public static void main(String[] args) {
		RotateLinkedList list = new RotateLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.printList();
		list.rotateList(4);
		list.printList();
	}

}
