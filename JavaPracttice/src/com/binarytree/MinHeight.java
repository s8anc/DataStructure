package com.binarytree;

import com.binarytree.Tree.Node;

public class MinHeight extends Tree{

	public int getMinHeight(Node root){
		if(root == null){
			return 0;
		}
		if(root.left == null && root.right == null){
			return 1;
		}
		if(root.left == null){
			return getMinHeight(root.right)+1;
		}
		if(root.right == null){
			return getMinHeight(root.left)+1;
		}
		return Math.min(getMinHeight(root.left), getMinHeight(root.right))+1;
		
	}

	public static void main(String[] args) {
		MinHeight tree = new MinHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.left = new Node(5);
		System.out.println(tree.getMinHeight(tree.root));
	}

}
