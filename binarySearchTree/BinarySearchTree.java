package com.cdac.binarySearchTree;

public class BinarySearchTree implements BST {
	
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
	
	@Override
	public void insert(int value) {
		root =  insertNode(root, value); 
	}
	
	private void deleteNode(BSTNode root, int value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int value) {
		deleteNode(root, value);
	}
	
	private void traverseBST(BSTNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			traverseBST(root.left);
		}
		
		System.out.print(root.value + " ");
		
		if(root.right != null) {
			traverseBST(root.right);
		}
	}

	@Override
	public void traverse() {
		traverseBST(root);
	}

	private boolean searchNode(BSTNode root,int value) {
		if(root == null) {
			return false;
		}
		
		if(root.value == value) {
			return true;
		}
		
		if(value < root.value) {
			return searchNode(root.left,value);
		}
		return searchNode(root.right,value);				
	}
	@Override
	public boolean search(int value) {
		return searchNode(root,value);
	}
	
}
