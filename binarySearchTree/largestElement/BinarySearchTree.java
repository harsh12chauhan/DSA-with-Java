package com.cdac.binarySearchTree.largestElement;

import com.cdac.binarySearchTree.BSTNode;

public class BinarySearchTree {
	
	private BSTNode root;
	
	public BinarySearchTree() {
		root = null;
	}
		
	private BSTNode insertNode(BSTNode root,int value) {
			
			if ( root == null ) {
				return new BSTNode(value);
			}
			
			if(value > root.value) {
				root.right = insertNode(root.right,value);
			}else {
				root.left = insertNode(root.left,value);
			}
			
			return root;
		}
	
	public void insert(int value) {
		root =  insertNode(root, value); 
	}
	
	private int largestElement(BSTNode root) {
		if(root.right == null) {
			return root.value;
		}
		
		return largestElement(root.right);
	}

	public int findLargest() {
		return largestElement(root);
	}
	
}
