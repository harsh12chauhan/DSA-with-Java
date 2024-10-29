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
	
	private BSTNode deleteNode(BSTNode root, int value) {
	    if (root == null) {
	        return null;
	    }

	    if (value == root.value) {
	        if (root.left != null && root.right != null) {
	            // Both children exist
	        	//BSTNode succPred = Helper.getSuccessor(root.right);
	            BSTNode succPred = Helper.getPredecessor(root.left);
	            root.value = succPred.value; // Swap values
	            root.right = deleteNode(root.right, succPred.value); // Delete the successor
	        } else if (root.left == null) {
	            // Only right child exists or no child (null)
	            return root.right;
	        } else if (root.right == null) {
	            // Only left child exists
	            return root.left;
	        } else {
	            // Leaf node
	            return null; // Should already be handled above, but good to explicitly show.
	        }
	    } else if (value > root.value) {
	        root.right = deleteNode(root.right, value);
	    } else {
	        root.left = deleteNode(root.left, value);
	    }
	    return root;
	}	
// ===== my code =========================================================================
//			if(root.left != null && root.right != null) {
//			// both child exists
//				//BSTNode succPred = Helper.getSuccessor(root.right);
//				BSTNode succPred = Helper.getPredecessor(root.left);
//
//				// swapping current nodes value with its succPred value
//				int temp = root.value;
//				root.value = succPred.value;
//				succPred.value = temp;
//				
//				//return deleteNode(succPred,value);
//				//succPred = null;
//				return root;
//			}
// ==============================================================================
	
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
