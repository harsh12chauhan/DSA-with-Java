package com.cdac.linkedList.linkedlistsMain;

import com.cdac.linkedList.impl.SinglyLinkedListClass;

public class LinkedListMain {

	public static void main(String[] args) {
		
		SinglyLinkedListClass sll = new SinglyLinkedListClass();
		
		sll.insertAtFirst(13);
		sll.insertAtEnd(9);
		sll.insertAtPosition(2, 99);
		
		sll.deleteAtFirst();
		sll.traverse();
		sll.deleteAtPos(0);
		sll.deleteAtEnd();
		sll.traverse();
		
	}

}
