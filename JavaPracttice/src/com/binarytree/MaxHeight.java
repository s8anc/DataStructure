package com.binarytree;

public class MaxHeight extends Tree{
	
	
	public int getMaxHeight(Node root){
		if(root == null){
			return 0;
		}
		int l = getMaxHeight(root.left);
		int r = getMaxHeight(root.right);
		return Math.max(l, r)+1;
	}

	public static void main(String[] args) {
		MaxHeight tree = new MaxHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.left = new Node(5);
		System.out.println(tree.getMaxHeight(tree.root));
	}

}
