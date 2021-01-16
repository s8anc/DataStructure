package com.binarytree;

public class RangeSumBST extends Tree {
	 private int sum = 0;
	
	public int rangeSumBST(Node root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.data >= low && root.data <= high){
            sum += root.data;
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
        }
        else if(root.data < low){
            rangeSumBST(root.right,low,high);
        }
        else if(root.data > high){
            rangeSumBST(root.left,low,high);
        }
        return sum;
    }

	public static void main(String[] args) {
		RangeSumBST tree = new RangeSumBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(7);
		tree.root.right.right = new Node(18);
		
		System.out.println(tree.rangeSumBST(tree.root, 7, 15));
	}

}
