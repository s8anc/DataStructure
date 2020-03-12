package com.ds.linkedlist;

public class Merge2SortedList extends LinkedList {
	
	public static Node sortedMerge(Node nodeA, Node nodeB){
		if(nodeA == null){
			return nodeB;
		}
		if(nodeB == null){
			return nodeA;
		}
		
		if(nodeA.data < nodeB.data){
			nodeA.next = sortedMerge(nodeA.next,nodeB);
			return nodeA;
		}
		else{
			nodeB.next = sortedMerge(nodeA,nodeB.next);
			return nodeB;
		}
	}

	public static void main(String[] args) {
		Merge2SortedList list1 = new Merge2SortedList();
		list1.append(1);
		list1.append(6);
		list1.append(8);
		list1.printList();
		
		Merge2SortedList list2 = new Merge2SortedList();
		list2.append(3);
		list2.append(6);
		list2.append(7);
		list2.append(9);
		list2.printList();
		
		list1.head = sortedMerge(list1.head, list2.head);
		
		list1.printList();
	}

}
