package com.cdac.Queue.impl;

import com.cdac.Queue.interfaces.MyQueue;

public class MyQueueClass implements MyQueue {
	private int []arr;
	private int size;
	private int front;
	private int rear;
	
	public MyQueueClass() {
		this.size = 5;
		this.arr = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public MyQueueClass(int size) {
		this.size = size;
		this.arr = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	@Override
	public void enqueue(int data) {
		
		//check if queue is full ?
		if ( isFull() ) {
			System.out.println("Queue is full");
			return;
		}
		
		// for first element
		if ( front == -1 ) {
			front = 0;
			rear = 0;
		}
		// to maintain cyclic nature
		else if ( rear == size - 1) {
			rear = 0;
		}
		//normal push
		else {
			rear++;
		}		
		
		arr[rear] = data;
		System.out.println("Inserted!!");
	}
	
	@Override
	public void dequeue() {
		
		// check if queue is empty ?
		if ( isEmpty() ) {
			System.out.println("Queue is empty");
			return;
		}
		
		//if only single element is present in queue
		if ( front == rear ) {
			front = -1;
			rear = -1;
		}
		// to maintain cyclic nature
		else if ( front == size - 1 ) {
			front = 0;
		}
		//normal pop
		else {
			front++;
		}
		System.out.println("Deleted!!");
	}
	
	@Override
	public int front() {
		if( isEmpty() ) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	@Override
	public boolean isEmpty() {
		if( front == -1 ) {
			return true;
		} 
		return false;
	}
	
	@Override
	public boolean isFull() {
		if(  ( front == 0 && rear == size - 1 ) || ( rear == ( front - 1 ) % ( size - 1 ) ) ) {
			return true;
		}
		return false;
	}
}
