package com.ds.linkedlist;

public class DeleteNodesWithGreaterValuesAtRight extends LinkedList {
	
	public void deleteNodes(){
		Node prev = null, curr = head;
		while(curr.next != null){
			if(curr.data < curr.next.data){
				if(prev == null){
					head = curr.next;
					curr = curr.next;
				}
				else{
					prev.next = curr.next;
					curr = curr.next;
				}
			}
			else{
				prev = curr;
				curr = curr.next;
			}
		}
		
	}

	public static void main(String[] args) {
		DeleteNodesWithGreaterValuesAtRight list = new DeleteNodesWithGreaterValuesAtRight();
		list.append(12);
		list.append(15);
		list.append(10);
		list.append(11);
		list.append(5);
		list.append(6);
		list.append(2);
		list.append(3);
		list.printList();
		list.deleteNodes();
		list.printList();
	}

}
