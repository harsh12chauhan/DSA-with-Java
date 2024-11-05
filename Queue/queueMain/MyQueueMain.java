package com.cdac.Queue.queueMain;

import com.cdac.Queue.impl.MyQueueClass;
import com.cdac.Queue.interfaces.MyQueue;

public class MyQueueMain {

	public static void main(String[] args) {
		MyQueue q = new MyQueueClass();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		q.enqueue(90);
		
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
	}

}
