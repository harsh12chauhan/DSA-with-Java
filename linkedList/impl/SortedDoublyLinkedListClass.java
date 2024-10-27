package com.cdac.linkedList.impl;

import com.cdac.exceptions.EmptyListsException;
import com.cdac.linkedList.interfaces.SortedDoublyLinkedList;

public class SortedDoublyLinkedListClass implements SortedDoublyLinkedList {
	
	DNode head;
	
	public SortedDoublyLinkedListClass() {
		head = null;
	}

	@Override
	public void insert(int value) {
		
		//create node
		DNode newNode = new DNode(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		DNode curr = head;
		
		if (curr.next == null) {
			if (curr.value < value) {
				curr.next = newNode;
				newNode.next = null;
				newNode.prev = curr;
				return;
			}
		}

		if (curr.value > value) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}

		while (curr.next != null) {
			if (curr.next.value > value) {
				break;
			}
			curr = curr.next;
		}

		newNode.next = curr.next;
		if (curr.next != null) {
			curr.next.prev = newNode;
		}
		curr.next = newNode;
		newNode.prev = curr;
	}

	@Override
	public int delete(int value) {
		
		int remove = -1;

		if (head.value == value) {
			remove = head.value;

			head = head.next;
			head.prev = null;
			return remove;
		}

		DNode temp = head;

		while (temp.next != null) {
			if (temp.next.value == value) {

				remove = temp.next.value;

				temp.next = temp.next.next;
				if (temp.next != null) {
					temp.next.prev = temp;
				}

				return remove;
			}
			temp = temp.next;
		}
		return remove;
		
//		System.out.println("Element Not Exist");
	}
		
	@Override
	public boolean search(int value) {
		DNode ptr = head;
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
	public void deleteAll(int value) {
		while (head.value == value) {
			DNode duplicate = head;
			while (duplicate.next.value == value) {
				duplicate = duplicate.next;
			}
			head = duplicate.next;
			head.prev = null;
		}

		DNode temp = head;

		while (temp.next != null) {
			if (temp.next.value == value) {
				DNode duplicate = temp.next;

				while (duplicate.next != null && duplicate.next.value == value) {
					duplicate = duplicate.next;
				}

				temp.next = duplicate.next;
				if (duplicate.next != null) {
					duplicate.prev = temp;
				}
				return;
			}
			temp = temp.next;
		}

	}

	@Override
	public void forwardTraversal() {
		DNode ptr = head;
		System.out.print("HEAD -> ");
		while( ptr != null ) {
			System.out.print(ptr.value + " -> ");
			ptr = ptr.next;
		} 
		System.out.println("NULL");
		
	}

	@Override
	public void backwardTraversal() {
		DNode ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		
		System.out.print("NULL -> ");
		while(ptr != null) {
			System.out.print(ptr.value + " -> ");
			ptr = ptr.prev;
		}
		System.out.println("HEAD");	
		
		
	}

}