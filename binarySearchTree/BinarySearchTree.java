package com.cdac.binarySearchTree;

import com.cdac.treeTraversal.Traversal;

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
	
	// finding the successor
	private BSTNode getSuccessor(BSTNode succ) {
		while(succ.left != null) {
			succ = succ.left;
		}
		return succ;
	}
	
	private BSTNode deleteNode(BSTNode root, int value) {
		if(root == null) {
			return null;
		}
		
		if(value == root.value) {
			if(root.left != null && root.right != null) {
			// both child exists
				// inorder Successor
				BSTNode successor = Helper.getSuccessor(root.right);

				// swaping current nodes value with its successor value
				int temp = root.value;
				root.value = successor.value;
				successor.value = temp;
				
				successor = null;
				return root;
			}else if(root.left == null && root.right != null) {
			// only right node exists
				return root.right;
			}else if(root.left != null && root.right == null) {
			// only left node exists
				return root.left;
			}else {
			// leaf node
				return null;
			}
			
		} else if(value > root.value) {
			root.right = deleteNode(root.right,value);
		} else {
			root.left = deleteNode(root.left,value);
		}
		
		return root;
	}
	@Override
	public void delete(int value) {
		root = deleteNode(root, value);
	}
	
	
//	private void traverseBST(BSTNode root) {
//		if(root == null) {
//			return;
//		}
//		
//		if(root.left != null) {
//			traverseBST(root.left);
//		}
//		
//		System.out.print(root.value + " ");
//		
//		if(root.right != null) {
//			traverseBST(root.right);
//		}
//	}

	@Override
	public void traverse() {
//		traverseBST(root);
		Traversal.levelorder(root);
		System.out.println("");
		System.out.println("========== END =========");
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
	
	private int smallestElement(BSTNode root) {
		if(root.left == null) {
			return root.value;
		}
		
		return smallestElement(root.left);
	}

	public int findSmallest() {
		return smallestElement(root);
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
