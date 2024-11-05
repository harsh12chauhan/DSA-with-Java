package com.cdac.Queue.interfaces;

public interface MyQueue {
	public void enqueue(int data);
	public void dequeue();
	public int front();
	public boolean isEmpty();
	public boolean isFull();	
}
