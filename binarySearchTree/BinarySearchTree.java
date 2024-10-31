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
	
	
// = DELETE NODE IN BST =============================================================================

	private BSTNode deleteNode(BSTNode root, int value) {
	    if (root == null) {
	        return null; 
	    }

	    if (value == root.value) {
	    	
	        if (root.left != null && root.right != null) {
	          // Both children exist
	        	 
	        	//if using predecessor
	            BSTNode predecessor = Helper.getPredecessor(root.left);
	            root.value = predecessor.value;                       // Replace value with predecessor's value
	            root.left = deleteNode(root.left, predecessor.value); // Delete the predecessor
	        	
		         /*
		            //if using Successor
		            BSTNode successor = Helper.getSuccessor(root.right);
		            root.value = successor.value; // Replace value with successor's value
		            root.right = deleteNode(root.right, successor.value); // Delete the successor
	             */
	            
	        } else if (root.left == null) {
	        	// only right childNode exists
	            return root.right; 
	        } else {
	            // Only left childNode exists
	            return root.left; 
	        }
	    } else if (value > root.value) {
	        root.right = deleteNode(root.right, value);
	    } else {
	        root.left = deleteNode(root.left, value);
	    }
	    return root;
	}

	@Override
	public void delete(int value) {
		root = deleteNode(root, value);
	}
// ==============================================================================
	
	@Override
	public void traverse() {
		Traversal.inOrder(root);
		System.out.println("");
		System.out.println("========== End =========");
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
