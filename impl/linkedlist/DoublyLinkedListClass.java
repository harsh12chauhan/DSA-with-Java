package com.cdac.impl.linkedlist;

import com.cdac.exceptions.EmptyListsException;
import com.cdac.interfaces.linkedList.DoublyLinkedList;

public class DoublyLinkedListClass implements DoublyLinkedList {
	DNode head;
	DNode tail;
	
	public DoublyLinkedListClass() {
		head = null;
		tail = null;
	}
	
	@Override
	public void insertAtFirst(int value) {
		
		DNode newNode = new DNode(value);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return ;
		}
		
		head.prev = newNode;
		newNode.next = head;
		head =  newNode;
	}

	@Override
	public void insertAtEnd(int value) {
		
		DNode newNode = new DNode(value);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	@Override
	public void insertAtPosition(int pos, int value) {
		
		if(isEmpty() || pos == 1) {
			insertAtFirst(value);
			return;
		}
		
		int i = 0;
		DNode ptr = head;
		
		while(i < pos-2 && ptr != null) {
			ptr = ptr.next;
			i++;
		}
		
		if(ptr != null) {	
			if(ptr.next == null) {
				insertAtEnd(value);
				return ;
			}
			
			DNode newNode = new DNode(value);
			
			newNode.prev = ptr;
			newNode.next = ptr.next;
			ptr.next.prev = newNode;
			ptr.next = newNode;
			return;
		}
		System.out.println("Invalid Position");
	}
	
	@Override
	public void deleteAtFirst() {
		if(isEmpty()) {
			System.out.println("No Elements Present.");
			return;
		}
		
		DNode temp = head;
		head = head.next;
		
		if(isEmpty()) {
			tail = null;
			return;
		}
		
		head.prev = null;
		temp.next = null;
	}

	@Override
	public void deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("No Elements Present.");
			return;
		}
		
		DNode ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		
		if(ptr != null) {
			tail = ptr.prev;
			head = ptr.next;
			if(ptr.prev != null) {
				ptr.prev.next = null;
				ptr.prev = null;
			}
			ptr.prev = null;
			ptr.next = null;
			return ;
		}
	}

	@Override
	public void deleteAtPos(int pos) {
		if(head == null || pos < 1) {
			return ;
		}
		
		if( pos == 1 ) {
			deleteAtFirst();
			return ;
		}
		
		DNode ptr = head;
		int i = 0;
		
		while(i < pos-2 && ptr != null) {
			i++;
			ptr = ptr.next;
		}
		
		if(ptr != null) {
			if(ptr.next == null) {
				deleteAtEnd();
				return;
			}
			
			if(ptr.next != null) {
				ptr.prev.next = ptr.next;
				ptr.next.prev = ptr.prev;
				ptr.next = null;
				ptr.prev = null;
				return;
			}
		}
		System.out.println("Invalid Index");
	}

	@Override
	public int getLength() {
		DNode ptr = head;
		
		int count = 0;
		while( ptr != null ) {
			count++;
			ptr = ptr.next;
		} 
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(head == null || tail == null) {
			try {
				throw new EmptyListsException("Empty !!!");
			}catch(EmptyListsException e) {
				System.out.println(e.getMessage());
			}
			return true;
		}
		return false;
	}


	@Override
	public void forwardTraversal() {
		
		DNode ptr = head;	
		System.out.print("HEAD -> ");
		while(ptr != null) {
			System.out.print(ptr.value + " -> ");
			ptr = ptr.next;
		}
		System.out.println("NULL");	
		
	}


	@Override
	public void backwardTraversal() {
		
		DNode ptr = tail;
		System.out.print("NULL -> ");
		while(ptr != null) {
			System.out.print(ptr.value + " -> ");
			ptr = ptr.prev;
		}
		System.out.println("HEAD");	
		
	}
	
}