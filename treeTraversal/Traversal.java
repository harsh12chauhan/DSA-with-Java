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
}
