package com.cdac.linkedList.impl;

public class DNode {
		
	public int value;
	public DNode prev;
	public DNode next;
	
	public DNode(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}

}
