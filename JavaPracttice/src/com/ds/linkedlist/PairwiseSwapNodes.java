package com.ds.linkedlist;

public class PairwiseSwapNodes extends LinkedList {
	
	public Node doSwapping(Node node){
		Node curr = node;
		Node prev = null;
		Node next = null;
		
		int c=2;
		
		while(c > 0 && curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			c--;
		}
		
		if(curr != null){
			node.next = doSwapping(curr);
		}
		return prev;
	}

	public static void main(String[] args) {
		PairwiseSwapNodes list = new PairwiseSwapNodes();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.printList();
		list.head = list.doSwapping(list.head);
		list.printList();
	}

}
