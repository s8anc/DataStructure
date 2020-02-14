package com.ds.linkedlist;




//push, append, delete key, delete index, size, search, print
public class LinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next =null;
		}
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAfter(Node prevNode, int data){
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	public void append(int data){
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}
	
	/* Given a key, deletes the first occurrence of key in linked list */
	public void delete(int key){
		Node temp = head, prev = null;
		
		//if head holds the key
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null){
			System.out.println("key not found");
			return;
		}
		
		if(temp.data == key){
			prev.next = temp.next;
		}
	}
	
	/* Delete a node at the given position in linked list */
	public void deleteIndex(int index){
		if(index == 0 && head != null){
			head = head.next;
			return;
		}
		int i = 0;
		Node current = head, prev = null;
		while(i != index-1){
			prev = current;
			current = current.next;
			i++;
		}
		prev.next = current.next;
		
	}
	
	public int getSize(){
		Node current = head;
		if(head == null){
			return 0;
		}
		int count = 1;
		while(current.next != null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	public boolean search(int data){
		Node current = head;
		if(current.data == data){
			return true;
		}
		while(current.next != null){
			current = current.next;
			if(current.data == data)
				return true;
		}
		return false;
	}
	
	public int get(int index){
		if(index == 0 && head != null){
			return head.data;
		}
		
		Node curr = head;
		int c = 0;
		while(curr.next != null){
			curr = curr.next;
			c++;
			if(c == index){
				return curr.data;
			}
		}
		assert(false); 
		return 0;
	}
	
	public void printList(){
		Node node = head;
		while(node != null){
			System.out.print(node.data+"\t");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//test 1
		LinkedList list = new LinkedList();
		//push
		list.push(5);
		list.push(3);
		list.push(2);
		list.printList();
		//append
		list.append(6);
		list.printList();
		//add after
		list.addAfter(list.head.next, 4);
		list.printList();
		//delete
		list.delete(4);
		list.printList();
		////deleteIndex
		list.deleteIndex(0);
		list.printList();
		list.append(7);
		list.printList();
		list.deleteIndex(2);
		list.printList();
		//size
		System.out.println("size : "+list.getSize());
		//search
		System.out.println(list.search(3));
		System.out.println(list.search(6));
		System.out.println(list.search(7));
		System.out.println(list.search(8));
		
		//get nth node
		System.out.println(list.get(2));
		
		
		
		System.out.println("\n\ntest 2");
		//test 2
		LinkedList l = new LinkedList();
		l.append(5);
		l.printList();
		System.out.println("size : "+l.getSize());
		l.deleteIndex(0);
		l.printList();
		System.out.println("size : "+l.getSize());
		System.out.println("the end");
		
	}
}
