package com.ds.linkedlist;


//Decimal equivalent of Binary Linked List
public class DecimalEquivalent extends LinkedList {
	
	static int sum = 0;
	static int c = 0;
	
	public void findDecimalEquivalent(Node node){
		if(node == null){
			return;
		}
		
		findDecimalEquivalent(node.next);
		
		sum = (int) (sum + node.data * (Math.pow(2, c)));
		c++;
	}
	
	public static void main(String[] args) {
		DecimalEquivalent list = new DecimalEquivalent();
		list.append(1);
		list.append(1);
		list.append(0);
		list.append(0);
		list.append(1);
		list.append(0);
		list.printList();
		list.findDecimalEquivalent(list.head);
		System.out.println(sum);

	}

}
