package com.cdac.binarySearchTree;

public class Helper {
	
	// finding the successor
	public  static  BSTNode getSuccessor(BSTNode succ) {
		while(succ.left != null) {
			succ = succ.left;
		}
		return succ;
	}
	
	// finding the predecessor
	public  static  BSTNode getPredecessor(BSTNode pred) {
		while(pred.right != null) {
			pred = pred.right;
		}
		return pred;
	}
}
