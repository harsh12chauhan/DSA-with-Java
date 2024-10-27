package com.cdac.binaryTree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree btm = new BinaryTree();
		
		btm.createHardCodedBinaryTree();
		
		System.out.println("Preorder: =======");
		btm.preorder();
		System.out.println("");
		
		System.out.println("Inorder: =======");
		btm.inorder();
		System.out.println("");
		
		System.out.println("Postorder: =======");
		btm.postorder();
		System.out.println("");
		
		System.out.println("Level Order: =======");
		btm.levelorder();
		System.out.println("");
		
		System.out.println("Total Number Of Nodes in Tree: " + btm.countNodes());
		System.out.println("Total Number Of Leaf Nodes in Tree: " + btm.countLeafNodes());
		
		int value = 4;
		System.out.println("Total Number Of Nodes with Specific values: " + btm.countNodesByElements(value));
		
		
		
	}

}
