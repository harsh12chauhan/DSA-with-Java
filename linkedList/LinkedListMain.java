package com.cdac.linkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.insertAtFirst(13);
		sll.insertAtFirst(12);
		sll.insertAtFirst(11);
		sll.insertAtFirst(10);
		
		sll.insertAtEnd(9);
		
		sll.insertAtPosition(3, 99);
		
		sll.traverse();

	}

}
