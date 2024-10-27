package com.cdac.binaryTree.countNodesWithGivenValue;

public class CountNodesWithElementMain {

	public static void main(String[] args) {
		CountNodesWithElement cnwe = new CountNodesWithElement();
		
		cnwe.createHardCodedBinaryTree();
		
		int value = 4;
		System.out.println("Total Number Of Nodes with Specific values: " + cnwe.countNodesByElements(value));	}
}
