package com.ds.linkedlist;

public class IdenticalList extends LinkedList {
	
	public static boolean areIdentical(IdenticalList list1, IdenticalList list2){
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		while(curr1 != null && curr2 != null){
			if(curr1.data != curr2.data){
				return false;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		
		if(curr1 == null && curr2 == null)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		IdenticalList list1 = new IdenticalList();
		IdenticalList list2 = new IdenticalList();
		
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		
		list2.append(1);
		list2.append(2);
		list2.append(3);
//		list2.append(4);
		
		System.out.println(areIdentical(list1, list2));
	}

}
