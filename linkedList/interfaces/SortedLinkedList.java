package com.cdac.linkedList.interfaces;

public interface SortedLinkedList {
	public void insert(int value);
	public void delete(int value);
	public boolean search(int value);
	public void deleteAll(int value);
	public boolean isEmpty();
	public void traverse();
}