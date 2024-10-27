package com.cdac.linkedlistsMain;

import com.cdac.impl.linkedlist.DoublyLinkedListClass;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		
		DoublyLinkedListClass dll = new DoublyLinkedListClass();
		
		dll.insertAtFirst(13);
		dll.insertAtFirst(17);
		dll.insertAtFirst(11);
		dll.insertAtFirst(19);
		dll.insertAtFirst(1);
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");

		dll.insertAtEnd(119);
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");
		
		dll.insertAtPosition(4, 99);		
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");
		
		
		dll.deleteAtFirst();
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");


		dll.deleteAtPos(1);
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");

		dll.deleteAtEnd();
		dll.forwardTraversal();
		dll.backwardTraversal();
		System.out.println("");

	}

}
