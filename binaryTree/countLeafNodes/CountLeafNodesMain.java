package com.cdac.binaryTree.countLeafNodes;

public class CountLeafNodesMain {

	public static void main(String[] args) {
		CountLeafNodes cln = new CountLeafNodes();
		
		cln.createHardCodedBinaryTree();
		
		System.out.println("Total Number Of Leaf Nodes in Tree: " + cln.countLeafNodes());

	}
}
