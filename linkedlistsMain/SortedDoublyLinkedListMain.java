package com.cdac.linkedlistsMain;
import com.cdac.impl.linkedlist.SortedDoublyLinkedListClass;

public class SortedDoublyLinkedListMain {

	public static void main(String[] args) {
		
		SortedDoublyLinkedListClass sdll = new SortedDoublyLinkedListClass();
		
		sdll.insert(2);
		sdll.insert(3);
		sdll.insert(2);
		sdll.insert(7);
		sdll.insert(2);
		sdll.insert(1);
		sdll.insert(5);
		sdll.insert(2);
		
		sdll.forwardTraversal();
		sdll.backwardTraversal();
		System.out.println("Search:");
		System.out.println(sdll.search(4));
		System.out.println(sdll.search(5));
		
		
		sdll.forwardTraversal();
		sdll.deleteAll(2);
		sdll.forwardTraversal();

		sdll.delete(7);
		sdll.backwardTraversal();
		
		sdll.delete(1);
		sdll.backwardTraversal();
		
		sdll.delete(5);
		sdll.backwardTraversal();
		
		sdll.delete(2);
		sdll.backwardTraversal();
		
		sdll.insert(5);
		sdll.backwardTraversal();
		
		sdll.delete(0);
		sdll.backwardTraversal();
		
		System.out.println("End");
	}

}