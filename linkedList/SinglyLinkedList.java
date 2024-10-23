package com.cdac.linkedList;

import com.cdac.interfaces.LinkedList;

public class SinglyLinkedList implements LinkedList {
	Node head;
	Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	@Override
	public void insertAtFirst(int value) {
		
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return ;
		}
		newNode.next = head.next;
		head =  newNode;
	}

	@Override
	public void insertAtEnd(int value) {
		Node newNode = new Node(value);
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public void insertAtPosition(int pos, int value) {
		
		if(isEmpty()) {
			insertAtFirst(value);
			return;
		}
		
		int i = 0;
		Node ptr = head;
		
		while(i < pos-2 && ptr != null) {
			ptr = ptr.next;
			i++;
		}
		
		if(ptr.next == null) {
			insertAtEnd(value);
			return ;
		}
		
		Node newNode = new Node(value);
		newNode.next = ptr.next;
		ptr.next = newNode;
	
	}

	@Override
	public void deleteAtFirst() {
		if(isEmpty()) {
			System.out.println("No Elements Present.");
			return;
		}
		
		//TODO: TAIL
		Node temp = head;
		head =  head.next;
		temp.next = null;
	}

	@Override
	public void deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("No Elements Present.");
			return;
		}
		
		Node ptr = head;
		while(ptr.next.next != null) {
			ptr =  ptr.next;
		}
		
		ptr.next = null;
		tail = ptr;
	}

	@Override
	public void deleteAtPos(int pos) {
		if(head == null) {
			return ;
		}
		
		if( pos == 1) {
			deleteAtFirst();
			return ;
		}
		
		Node ptr = head;
		int i = 0;
		
		while(i < pos-2 && ptr != null) {
			i++;
			ptr =  ptr.next;
		}
		
		if(ptr != null) {
			if(ptr.next == null) {
				deleteAtEnd();
			}
		}
	}

	@Override
	public void traverse() {
		Node ptr = head;
		
		System.out.println("HEAD -> ");
		while( ptr != null ) {
			System.out.println(ptr.value + " -> ");
			ptr = ptr.next;
		} 
		System.out.println("NULL");
		
	}
	
	@Override
	public int getLength() {
		Node ptr = head;
		
		int count = 0;
		while( ptr != null ) {
			count++;
			ptr = ptr.next;
		} 
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(head == null && tail == null) {
			return true;
		}
		return false;
	}
	
}
