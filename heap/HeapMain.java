package com.cdac.heap;

public class HeapMain {

	public static void main(String[] args) {
//		MaxHeap maxHeap = new MaxHeap();
//		
//		maxHeap.insert(12);
//		maxHeap.insert(5);
//		maxHeap.insert(2);
//		maxHeap.insert(120);
//		maxHeap.insert(56);
//		
//		maxHeap.insert(10);
//	    maxHeap.insert(9);
//	    maxHeap.insert(80);
//	    maxHeap.insert(3);
//	    maxHeap.insert(122);
//		
//	    System.out.println("before delete: ");
//		maxHeap.print();
//		
//		maxHeap.delete();
//		
//		System.out.println("after delete: ");
//		maxHeap.print();
		
		// == Heapify ======================================
		int [] arr = {-1,55,43,54,98,12,43,23,1,3};
		int size = 10;

		Heapify.convertToHeap(arr, size);
		
		System.out.println("printing :- ");	
		Heapify.print(arr, size);
	    
	}

}
