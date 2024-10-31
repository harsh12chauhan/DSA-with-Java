package com.cdac.binarySearchTree.largestElement;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
				
		bst.insert(40);
		bst.insert(20);
		bst.insert(60);
		bst.insert(10);
		bst.insert(25);
		bst.insert(55);
		bst.insert(100);
		bst.insert(80);
		bst.insert(70);
		bst.insert(120);
		bst.insert(75);
	
		System.out.println("Largest element present: " + bst.findLargest());
	}

}
