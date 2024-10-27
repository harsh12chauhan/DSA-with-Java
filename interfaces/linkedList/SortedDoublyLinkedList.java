package com.cdac.interfaces.linkedList;

public interface SortedDoublyLinkedList {
	public void insert(int value);
	public int delete(int value);
	public boolean search(int value);
	public void deleteAll(int value);
	public boolean isEmpty();
	public void forwardTraversal();
	public void backwardTraversal();
}