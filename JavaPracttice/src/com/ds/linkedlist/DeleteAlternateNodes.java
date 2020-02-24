package com.ds.linkedlist;

public class DeleteAlternateNodes extends LinkedList {
	
	public void deleteAlternateNodes(){
		Node prev = null, curr = head;
		int c = 0;
		while(curr != null){
			if(c%2 != 0){
				prev.next = curr.next;
				curr = curr.next;
			}
			else{
				prev = curr;
				curr = curr.next;
			}
			c++;
		}
		
	}

	public static void main(String[] args) {
		DeleteAlternateNodes list = new DeleteAlternateNodes();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.printList();
		list.deleteAlternateNodes();
		list.printList();
	}

}
