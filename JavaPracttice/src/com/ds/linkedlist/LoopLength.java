package com.ds.linkedlist;

public class LoopLength extends LinkedList {
	
	public void findLoopLength(){
		boolean isLoop = false;
		Node slow = head;
		Node fast = head;
		Node pointer = null;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				pointer = slow;
				isLoop = true;
				break;
			}
		}
		if(isLoop){
			int counter = 1;
			slow = slow.next;
			while(slow != pointer){
				slow = slow.next;
				counter++;
			}
			
			System.out.println("Loop length : "+ counter);
		}
		else{
			System.out.println("No loop detected.");
		}
		
	}
	
	public static void main(String[] args) {
		LoopLength list = new LoopLength();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.head.next.next.next.next.next.next = list.head.next;
		list.findLoopLength();
		
		LoopLength list1 = new LoopLength();
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		list1.append(5);
		list1.findLoopLength();
	}
}
