package com.cdac.queue.interfaces;

public interface MyQueue {
	public void enqueue();
	public void dequeue();
	public void front();
	public boolean isEmpty();
	public boolean isFull();	
}
