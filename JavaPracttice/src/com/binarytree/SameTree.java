package com.binarytree;


public class SameTree extends Tree {
	
	public static boolean isSameTree(Node a, Node b){
		if(a == null || b==null){
			return a == b;
		}
		if(a.data != b.data){
			return false;
		}
		return isSameTree(a.left,b.left) && isSameTree(a.right,b.right); 
	}
	

	public static void main(String[] args) {
		SameTree tree1 = new SameTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		
		SameTree tree2 = new SameTree();
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.right.left = new Node(4);
		
		System.out.println(isSameTree(tree1.root,tree2.root));
	}

}
