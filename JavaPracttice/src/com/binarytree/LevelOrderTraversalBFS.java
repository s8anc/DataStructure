package com.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.binarytree.Tree.Node;

public class LevelOrderTraversalBFS extends Tree{
	private List<List<Integer>> list =new ArrayList<List<Integer>>();
	private Queue<Node> q = new LinkedList<Node>();
	
	public List<List<Integer>> orderTraversal(Node root){
		if(root == null){
			return list;
		}
		q.add(root);
		traverse(1);
		return list;
	}
	public void traverse(int count){
		
		List<Integer> innerList = new ArrayList<Integer>();
		int nextLevelCount = 0;
		while(count>0){
			Node node = q.poll();
			if(null != node.left){
				q.add(node.left);
				nextLevelCount++;
			}
			if(null != node.right){
				q.add(node.right);
				nextLevelCount++;
			}
			innerList.add(node.data);
			count--;
		}
		list.add(innerList);
		if(!q.isEmpty()){
			traverse(nextLevelCount);
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversalBFS tree = new LevelOrderTraversalBFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println(tree.orderTraversal(tree.root));
	}

}
