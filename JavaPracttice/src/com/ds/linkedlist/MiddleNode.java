package com.ds.linkedlist;


/*if given linked list is 1->2->3->4->5 then output should be 3.
 * If there are even nodes, then there would be two middle nodes, we need to print second middle element. 
 * For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 */
public class MiddleNode extends LinkedList {
	
	public int findMiddleNode(){
		Node front = head, back = head;
		int c = 0;
		
		while(front.next!=null){
			front = front.next;
			if(c%2 == 0){
				back = back.next;
			}
			c++;
		}
		
		return back.data;
	}
	
	public static void main(String[] args) {
		MiddleNode oddList = new MiddleNode();
		oddList.append(1);
		oddList.append(2);
		oddList.append(3);
		oddList.append(4);
		oddList.append(5);
		oddList.printList();
		System.out.println(oddList.findMiddleNode());
		
		MiddleNode evenList = new MiddleNode();
		evenList.append(10);
		evenList.append(20);
		evenList.append(30);
		evenList.append(40);
		evenList.append(50);
		evenList.append(60);
		evenList.printList();
		System.out.println(evenList.findMiddleNode());
	}

}
