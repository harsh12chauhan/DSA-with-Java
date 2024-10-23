package com.cdac.interfaces;

public interface LinkedList {
	public void insertAtFirst(int value);
	public void insertAtEnd(int value);
	public void insertAtPosition(int pos,int value);
	
	public void deleteAtFirst();
	public void deleteAtEnd();
	public void deleteAtPos(int pos);
	
	public boolean isEmpty();
	public void traverse();
	public int getLength();
	
}
