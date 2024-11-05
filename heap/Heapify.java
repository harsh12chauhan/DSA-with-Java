package com.cdac.heap;

public class Heapify {
	private static void toMaxHeap(int []arr,int size,int index) {
		int largest = index;
		
		int leftChild = 2*index;
		int rightChild = 2*index + 1;
		
		//if zero based indexing 
		//int leftChild = 2*index + 1;
		//int rightChild = 2*index + 2;
		
		if ( leftChild < size && arr[largest] < arr[leftChild]) {
			largest = leftChild;
		}
		
		if ( rightChild < size && arr[largest] < arr[rightChild]) {
			largest = rightChild;
		}
		
		if ( largest == index ) {
			return;
		}
		
		int temp = arr[index];
		arr[index] = arr[largest];
		arr[largest] = temp;
		
		//tail recursion
		toMaxHeap(arr,size,largest);
	}
	
//	private static void toMaxHeapRemovedTailRecr(int []arr,int size,int index) {
//		int largest = index;
//		
//		while( true ) {
//			int leftChild = 2*index;
//			int rightChild = 2*index + 1;
//			
//			
//			if ( leftChild < size && arr[largest] < arr[leftChild]) {
//				largest = leftChild;
//			}
//			
//			if ( rightChild < size && arr[largest] < arr[rightChild]) {
//				largest = rightChild;
//			}
//			
//			if ( largest != index ) {
//				int temp = arr[index];
//				arr[index] = arr[largest];
//				arr[largest] = temp;	
//				
//				index = largest;
//			}else {
//				return;
//			}
//		}
//	}
	
	private static void toMinHeap(int []arr,int size,int index) {
		int smallest = index;
		
		int leftChild = 2*index;
		int rightChild = 2*index + 1;
		
		//if zero based indexing 
		//int leftChild = 2*index + 1;
		//int rightChild = 2*index + 2;
		
		if ( leftChild < size && arr[smallest] > arr[leftChild]) {
			smallest = leftChild;
		}
		
		if ( rightChild < size && arr[smallest] > arr[rightChild]) {
			smallest = rightChild;
		}
		
		if ( smallest != index ) {
			int temp = arr[index];
			arr[index] = arr[smallest];
			arr[smallest] = temp;
			
			toMinHeap(arr,size,smallest);
		}
	}
	
	public static void convertToHeap(int []arr, int size, boolean flag ) {
		
		// (n/2) because last ke n/2 elements leaf [node/elements] hai vo already heap hi huaa na
		if ( flag ) {
			//minHeap
			for (int i = size/2 ; i > 0 ; i--) {			
				//toMaxHeapRemovedTailRecr(arr,size,i);
				toMaxHeap(arr,size,i);
			}	
			
			return;
		}
		
		// maxHeap
		for (int i = size/2 ; i > 0 ; i--) {			
			toMinHeap(arr,size,i);
		}
		
	}
	
	public static void print(int [] arr,int size) {
		  for( int i = 1 ; i <= size ; i++ ){   
			  System.out.print( arr[i] + " ");
		    }
		  System.out.println("");
	}
}
