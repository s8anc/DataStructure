package com.binarytree;

public class TreeTraversal {
	private Node root;
	
	public static class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void preOrderTraverse(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.data+"\t");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	public void inOrderTraverse(Node node){
		if(node == null){
			return;
		}
		inOrderTraverse(node.left);
		System.out.print(node.data+"\t");
		inOrderTraverse(node.right);
	}
	
	public void postOrderTraverse(Node node){
		if(node == null){
			return;
		}
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.print(node.data+"\t");
	}
	

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("\n"+"PreOreder");
		tree.preOrderTraverse(tree.root);
		
		System.out.println("\n"+"InOrder");
		tree.inOrderTraverse(tree.root);
		
		System.out.println("\n"+"PostOreder");
		tree.postOrderTraverse(tree.root);
	}

}
