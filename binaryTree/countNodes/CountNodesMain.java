package com.cdac.binaryTree.countNodes;

public class CountNodesMain {

	public static void main(String[] args) {
		CountNodes cn = new CountNodes();
		
		cn.createHardCodedBinaryTree();
		
		System.out.println("Total Number Of Nodes in Tree: " + cn.countNodes());
	}
}
