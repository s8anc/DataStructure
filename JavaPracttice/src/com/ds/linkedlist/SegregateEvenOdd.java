package com.ds.linkedlist;

public class SegregateEvenOdd extends LinkedList {
	
	
	public void doSegregate(){
		Node lastNode = head;
		int size=1;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			size++;
		}
		Node curr = head;
		Node prev = null;
		while(size>0){
			if(curr.data % 2 != 0){
				if(prev == null){
					head = curr.next;
					curr.next = null;
					lastNode.next = curr;
					curr = head;
					lastNode = lastNode.next;
				}
				else{
					prev.next = curr.next;
					curr.next = null;
					lastNode.next = curr;
					curr = prev.next;
					lastNode = lastNode.next;
				}
			}
			else{
				prev = curr;
				curr = curr.next;
			}
			size--;
		}
		
	}

	public static void main(String[] args) {
		SegregateEvenOdd list = new SegregateEvenOdd();
		list.append(1);
		list.append(2);
		list.append(7);
		list.append(3);
		list.append(6);
		list.append(4);
		list.append(5);
		list.printList();
		list.doSegregate();
		list.printList();
	}

}
