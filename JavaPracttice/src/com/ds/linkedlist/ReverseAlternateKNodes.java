package com.ds.linkedlist;


public class ReverseAlternateKNodes extends LinkedList {
	
	public Node doReverse(Node node, int k){
		Node curr = node;
		Node prev = null;
		Node next = null;
		int j = k;
		while(j>0 && curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			j--;
		}
		node.next = curr;
		
		j = k;
		while(j-1>0 && curr != null){
			curr = curr.next;
			j--;
		}
		if(curr != null){
			curr.next = doReverse(curr.next, k);
		}
		return prev;
	}

	public static void main(String[] args) {
		ReverseAlternateKNodes list = new ReverseAlternateKNodes();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
//		list.append(9);
		list.printList();
		list.head = list.doReverse(list.head, 3);
		list.printList();
	}

}
