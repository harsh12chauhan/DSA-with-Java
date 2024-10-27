package com.cdac.binaryTree;

public interface BinaryTreeInterface {
	public void createHardCodedBinaryTree();
	public void preorder();
	public void inorder();
	public void postorder();
	public void levelorder();
	public int countNodes();
	public int countLeafNodes();
	public int countNodesByElements(int element);
}
