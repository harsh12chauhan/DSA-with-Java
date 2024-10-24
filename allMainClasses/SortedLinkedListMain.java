package com.cdac.allMainClasses;

import com.cdac.impl.linkedlist.SortedLinkedListClass;

public class SortedLinkedListMain {

	public static void main(String[] args) {
		
		SortedLinkedListClass sll = new SortedLinkedListClass();
		
		sll.insert(2);
		sll.insert(3);
		sll.insert(2);
		sll.insert(7);
		sll.insert(2);
		sll.insert(1);
		sll.insert(5);
		sll.insert(2);
		
		sll.traverse();
		
		System.out.println("Search:");
		System.out.println(sll.search(4));
		System.out.println(sll.search(5));
		
//		sll.delete(2);
		
		sll.traverse();
		sll.deleteAll(2);
		sll.traverse();
		
//		sll.delete(7);
//		sll.traverse();
//		
//		sll.delete(1);
//		sll.traverse();
//		
//		sll.delete(5);
//		sll.traverse();
//		
//		sll.delete(2);
//		sll.traverse();
//		
//		sll.insert(5);
//		sll.traverse();
//		
//		sll.delete(0);
//		sll.traverse();
		
		
		System.out.println("End");
	}

}
