package com.ds.linkedlist;

public class DetectLoop extends LinkedList {
	
	//Floyd’s Cycle algo
	// fast pointer will work with 2 next or 3 next but in case there is no loop it will break
	public void detectLoop(){
		Node slow = head, fast = head;
		
		while(fast != null && fast.next != null ){//this check when list size is even no and fast.next != null when list size is odd no
			slow = slow.next;
			fast = fast.next.next;// will work with 3 times next
			if(slow == fast){
				System.out.println("Loop detected.");
				return;
			}
		}
		System.out.println("No loop");
	}

	public static void main(String[] args) {
		DetectLoop list = new DetectLoop();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		//	  1	   2	3	 4    5    6    7	 
		list.head.next.next.next.next.next.next.next = list.head.next.next;// 7 is pointing to 3
		list.detectLoop();
		
		
		DetectLoop list1 = new DetectLoop();
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		list1.append(5);
		list1.detectLoop();
		
		
		DetectLoop list2 = new DetectLoop();
		list2.append(1);
		list2.append(2);
		list2.append(3);
		list2.append(4);
		list2.append(5);
		//	  1	   2	3	 4    5  	 
		list2.head.next.next.next.next.next = list2.head.next.next;// 5 is pointing to 3
		list2.detectLoop();
		
		
		DetectLoop list3 = new DetectLoop();
		list3.append(1);
		list3.append(2);
		list3.append(3);
		list3.append(4);
		list3.append(5);
		//	  1	   2	3	 4    5  	 
		list3.head.next.next.next.next.next = list3.head.next;// 5 is pointing to 2
		list3.detectLoop();
		
		
		DetectLoop list4 = new DetectLoop();
		list4.append(1);
		list4.append(2);
		list4.append(3);
		//	  1	   2	3	   	 
		list4.head.next.next.next = list4.head;// 5 is pointing to 2
		list4.detectLoop();
	}

}
