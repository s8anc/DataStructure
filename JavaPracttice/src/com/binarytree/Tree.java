package com.binarytree;


public class Tree {
	protected Node root;
	public static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
}
