package com.cdac.binaryTree.heightOfBinaryTree;

public class HeightOfBinaryTreeMain {

	public static void main(String[] args) {
		HeightOfBinaryTree hbt = new HeightOfBinaryTree();
		
		hbt.createHardCodedBinaryTree();
		
		System.out.println("height of binary tree is: " + hbt.height());
	}
}
