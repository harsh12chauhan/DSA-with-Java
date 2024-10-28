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
	public  static  BSTNode getPredecessor(BSTNode succ) {
		while(succ.right != null) {
			succ = succ.right;
		}
		return succ;
	}
}
