package com.cdac.impl.linkedlist;

import com.cdac.exceptions.EmptyListsException;
import com.cdac.interfaces.linkedList.SortedLinkedList;

public class SortedLinkedListClass implements SortedLinkedList {
	
	private Node head;
	
	public SortedLinkedListClass() {
		head = null;
	}

	@Override
	public void insert(int value) {
		
		//create node
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node curr = head; 
		Node prev = null;
		
		while(curr != null) {
			if(curr.value > newNode.value) {
				break;
			}
			
			prev = curr;
			curr = curr.next;
		}		
		
		if(prev == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		prev.next = newNode;
		newNode.next = curr;
		
	}

	@Override
	public void delete(int value) {
		
		if(isEmpty()) {
			return;
		}
		
		Node curr = head;
		if(curr.value == value) {
			head = head.next;
			return;
		}
		
		while(curr.next != null) {
			if(curr.next.value == value) {
				curr.next = curr.next.next;
				return;
			}
			curr = curr.next;
		}
		
		System.out.println("Element Not Exist");
	}
		
	@Override
	public boolean search(int value) {
		Node ptr = head;
		while(ptr != null) {
			if( ptr.value == value) {
				return true;
			}
			ptr = ptr.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			try {
				throw new EmptyListsException("Empty !!! ");
			}catch(EmptyListsException e) {
				System.out.println(e.getMessage());
				return true;
			}
		}
		return false;
	}

	@Override
	public void traverse() {
		Node ptr = head;
		System.out.print("HEAD -> ");
		while( ptr != null ) {
			System.out.print(ptr.value + " -> ");
			ptr = ptr.next;
		} 
		System.out.println("NULL");
	}

	@Override
	public void deleteAll(int value) {
//		if(isEmpty()) {
//			return;
//		}
//		
//		Node curr = head;
//		
//		if(curr.value == value) {
//			System.out.println(curr);
//			head = head.next;
//		}
//		
//		while(curr.next != null) {
//			if(curr.next.value == value) {
//				System.out.println(curr.value);
//				curr.next = curr.next.next;
//			}
//			curr = curr.next;
//		}

		//System.out.println("Element Not Exist");
	}

}