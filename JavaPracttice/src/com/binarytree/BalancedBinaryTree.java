package com.binarytree;

public class BalancedBinaryTree extends Tree{
	private boolean isBalanced = true;
	
	public boolean isBalancedTree(Node root){
		if(root == null){
			return true;
		}
		getHeight(root);
		return isBalanced;
	}
	
	private int getHeight(Node root){
		if(root==null){
			return 0;
		}
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		
		if(Math.abs(l-r)> 1){
			isBalanced = false;
		}
		return Math.max(l,r)+1;
		
	}

	public static void main(String[] args) {
		BalancedBinaryTree tree = new BalancedBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.right = new Node(8);
		tree.root.right.right.right.right = new Node(9);
		
		System.out.println(tree.isBalancedTree(tree.root));
		System.out.println(null == null);
	}

}
