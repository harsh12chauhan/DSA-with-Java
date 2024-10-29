package com.cdac.treeTraversal;

import java.util.LinkedList;
import java.util.Queue;

import com.cdac.binarySearchTree.BSTNode;

public class Traversal {
	
	public static void levelorder(BSTNode root) {
		Queue<BSTNode> nodesQueue = new LinkedList<>();
		
		nodesQueue.add(root);
		nodesQueue.add(null);
		
		while( !nodesQueue.isEmpty() ) {
			
			BSTNode front = nodesQueue.peek();
			nodesQueue.remove(front);
			
			if(front == null && !nodesQueue.isEmpty()) {
				nodesQueue.add(null);
				System.out.println("");
				continue;
			}
			
			if(front != null) {
				System.out.print(front.value + " ");
			}
			
			if(front != null && front.left != null) {
				nodesQueue.add(front.left);
			}
			
			if(front != null && front.right != null) {
				nodesQueue.add(front.right);
			}
		}
	}
	
	public static void preOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.value + " ");
		
		if(root.left != null) {
			preOrder(root.left);
		}
		
		if(root.right != null) {
			preOrder(root.right);
		}
	}	
	
	
	public static void inOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		
		
		if(root.left != null) {
			inOrder(root.left);
		}
		
		System.out.print(root.value + " ");
		
		if(root.right != null) {
			inOrder(root.right);
		}
	}
	
	public static void postOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			postOrder(root.left);
		}
		
		if(root.right != null) {
			postOrder(root.right);
		}
		
		System.out.print(root.value + " ");
	}
}
