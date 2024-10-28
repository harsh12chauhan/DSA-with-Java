package com.cdac.binarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
				
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(20);
		bst.insert(17);
		bst.insert(3);
		bst.insert(12);
		bst.insert(9);
		bst.insert(4);

		bst.traverse();
		
		bst.delete(15);
		bst.traverse();
		
		System.out.println("Smallest element present: " + bst.findSmallest());
		System.out.println("Largest element present: " + bst.findLargest());
		
		
		

	}

}
