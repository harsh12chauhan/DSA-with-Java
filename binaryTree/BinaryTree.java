package com.cdac.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;


public class BinaryTree implements BinaryTreeInterface {
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	@Override
	public void createHardCodedBinaryTree() {
		
		BTNode n1 = new BTNode(10);
		BTNode n2 = new BTNode(5);
		BTNode n3 = new BTNode(4);
		BTNode n4 = new BTNode(3);
		BTNode n5 = new BTNode(2);
		BTNode n6 = new BTNode(7);
		BTNode n7 = new BTNode(9);
		BTNode n8 = new BTNode(8);
		BTNode n9 = new BTNode(6);
		BTNode n10 = new BTNode(15);
		BTNode n11 = new BTNode(12);
		BTNode n12 = new BTNode(11);
		BTNode n13 = new BTNode(17);
		BTNode n14 = new BTNode(4);
		
		n1.left = n2;
		n1.right = n3;
		
		n2.left = n4;
		n2.right = n5;
		
		n3.left = n6;
		n3.right = n7;
		
		n4.left = n14;
		n4.right = n8;
		
		n5.left = n9;
		n5.right = null;
		
		n6.left = n10;
		n6.right = n11;
		
		n7.left = null;
		n7.right = n12;
		
		n8.left = null;
		n8.right = null;
		
		n9.left = null;
		n9.right = null;
		
		n10.left = null;
		n10.right = null;
		
		n11.left = n13;
		n11.right = null;
		
		n12.left = null;
		n12.right = null;
		
		n13.left = null;
		n13.right = null;
		
		root = n1;
	}
	
	private void preOrder(BTNode root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.value + " ");
		
		if(root.left != null) {
			preOrder(root.left);
		}
		
		if(root.right != null) {
			preOrder(root.right);
		}
	}	
	
	@Override
	public void preorder() {
		preOrder(root);
	}
	
	private void inOrder(BTNode root) {
		if(root == null) {
			return;
		}
		
		
		if(root.left != null) {
			inOrder(root.left);
		}
		
		System.out.print(root.value + " ");
		
		if(root.right != null) {
			inOrder(root.right);
		}
	}
	
	@Override
	public void inorder() {
		inOrder(root);
	}
	
	private void postOrder(BTNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			postOrder(root.left);
		}
		
		if(root.right != null) {
			postOrder(root.right);
		}
		
		System.out.print(root.value + " ");
	}
	
	@Override
	public void postorder() {
		postOrder(root);
	}
	
	@Override
	public void levelorder() {
		Queue<BTNode> nodesQueue = new LinkedList<>();
		
		nodesQueue.add(root);
		nodesQueue.add(null);
		
		while( !nodesQueue.isEmpty() ) {
			
			BTNode front = nodesQueue.peek();
			nodesQueue.remove(front);
			
			if(front == null && !nodesQueue.isEmpty()) {
				nodesQueue.add(null);
				System.out.println("");
				continue;
			}
			
			if(front != null) {
				System.out.print(front.value + " ");
			}
			
			if(front != null && front.left != null) {
				nodesQueue.add(front.left);
			}
			
			if(front != null && front.right != null) {
				nodesQueue.add(front.right);
			}
		}
	}
	
	private int cntNodes(BTNode root) {
		if(root == null) {
			return 0;
		}
				
		int NodeCnt = 0;
		
		if(root.left != null) {
			NodeCnt += cntNodes(root.left);
		}
		
		if(root.right != null) {
			NodeCnt += cntNodes(root.right);
		}
		
		return 1 + NodeCnt;
	}	
	
	@Override
	public int countNodes() {
		return cntNodes(root);
	}
	
	
	private void cntLeafNodes(BTNode root,AtomicInteger leafNodesCount ) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			//leafNode
			leafNodesCount.incrementAndGet(); // incrementing the value of AtomicInteger variable
		}
		
		cntLeafNodes(root.left,leafNodesCount);
		cntLeafNodes(root.right,leafNodesCount);
	}	
	
	@Override
	public int countLeafNodes() {
		AtomicInteger leafNodesCount = new AtomicInteger(0);
		cntLeafNodes(root,leafNodesCount);
		return leafNodesCount.get(); // getting the value from AtomicInteger variable
	}
	
	
	private void cntNodesByElement(BTNode root,int element ,AtomicInteger leafNodesCount ) {
		if(root == null) {
			return;
		}
		
		if(root != null && root.value == element) {
			//leafNode
			leafNodesCount.incrementAndGet(); // incrementing the value of AtomicInteger variable
		}
		
		cntNodesByElement(root.left,element,leafNodesCount);
		cntNodesByElement(root.right,element,leafNodesCount);
	}
	@Override
	public int countNodesByElements(int element) {
		AtomicInteger leafNodesCount = new AtomicInteger(0);
		cntNodesByElement(root,element,leafNodesCount);
		return leafNodesCount.get(); // getting the value from AtomicInteger variable
	}
	
	private void calculateHight(BTNode root,int currHeight, AtomicInteger maxi) {
		
		if( root == null ) {
			return;
		}
		
		if (root.left == null && root.right == null) {
			if(currHeight > maxi.get()) {
				maxi.set(currHeight);
			}
			return;
		}
		
		if(root.left != null) {			
			calculateHight(root.left,1 + currHeight,maxi);
		}
		
		if(root.right != null) {	
			calculateHight(root.right,1 + currHeight,maxi);
		}
		
	}
	public int height() {
		AtomicInteger maxi = new AtomicInteger(0);
		calculateHight(root,0,maxi);
		return maxi.get(); 
	}
}
