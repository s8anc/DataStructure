package com.ds.linkedlist;


/*
 * logic
 * step 1 : find prev and curr Node for both keys
 * step 2 : change prev node pointers 
 * step 3 : change curr node pointers
*/
public class SwapNodes extends LinkedList{
	
	public void swapNode(int a, int b){
		//find prev and curr node for a
		Node currA = head, prevA = null;
		while(currA.next != null){
			if(currA.data == a){
				break;
			}
			prevA = currA;
			currA = currA.next;
		}
		
		//find prev and curr node for b
		Node currB = head, prevB =null;
		while(currB.next != null){
			if(currB.data == b){
				break;
			}
			prevB = currB;
			currB = currB.next;
		}
		
		//prev node pointer change
		if(prevA == null){
			head = currB;
		}
		else{
			prevA.next = currB;
		}
		if(prevB==null){
			head = currA;
		}
		else{
			prevB.next = currA;
		}
		
		//curr node pointer change
		Node temp = currB.next;
		currB.next = currA.next;
		currA.next = temp;

	}
	

	public static void main(String[] args) {
		SwapNodes l = new SwapNodes();
		l.push(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.printList();
		l.swapNode(2, 4);
		l.printList();
		
		SwapNodes l2 = new SwapNodes();
		l2.push(10);
		l2.append(20);
		l2.append(30);
		l2.append(40);
		l2.append(50);
		l2.printList();
		l2.swapNode(10, 50);
		l2.printList();
	}

}
