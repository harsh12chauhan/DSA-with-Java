package com.cdac.binarySearchTree.smallestElement;

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

	private int smallestElement(BSTNode root) {
		if(root.left == null) {
			return root.value;
		}
		
		return smallestElement(root.left);
	}

	public int findSmallest() {
		return smallestElement(root);
	}
	
}
