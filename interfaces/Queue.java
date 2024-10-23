package com.cdac.interfaces;

public interface Queue {
	public void enqueue();
	public void dequeue();
	public void front();
	public boolean isEmpty();
	public boolean isFull();	
}
