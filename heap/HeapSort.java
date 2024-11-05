package com.cdac.heap;

public class HeapSort {
	private static void heapify(int []arr ,int size,int index) {
		int largest = index;
		
		//if zero based indexing 
		int leftChild = 2*index + 1;
		int rightChild = 2*index + 2;
		
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
			
			//tail recursion
			heapify(arr,size,largest);
		}
	}
	
	public static void sort(int []arr ,int size) {
		
		//Build the max heap
		for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
		  
		int index = size - 1;
		
		while (index > 0) {
			
			//swap last element to root/1st index
			int temp = arr[0];
			arr[0] = arr[index];
			arr[index] = temp;
			
			index--;
			
			//heapify
			heapify(arr,index,0);
		}
	}
}
