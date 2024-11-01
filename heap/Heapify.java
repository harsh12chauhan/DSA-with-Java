package com.cdac.heap;

public class Heapify {
	private static void toHeap(int []arr,int size,int index) {
		int largest = index;
		
		int leftChild = 2*index;
		int rightChild = 2*index + 1;
		
		if ( leftChild < size && arr[largest] < arr[leftChild]) {
			largest = leftChild;
		}
		
		if ( rightChild < size && arr[largest] < arr[rightChild]) {
			largest = rightChild;
		}
		
		if ( largest != index ) {
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			
			toHeap(arr,size,largest);
		}
	}
	
	public static void convertToHeap(int []arr ,int size) {
		
		// (n/2) because last ke n/2 elements leaf [node/elements] hai vo already heap hi huaa na
		for (int i = size/2 ; i > 0 ; i--) {			
			toHeap(arr,size,i);
		}
		
	}
	
	public static void print(int [] arr,int size) {
		  for( int i = 1 ; i < size ; i++ ){   
			  System.out.print( arr[i] + " ");
		    }
		  System.out.println("");
	}
}
