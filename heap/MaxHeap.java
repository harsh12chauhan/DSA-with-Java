package com.cdac.heap;

public class MaxHeap implements Heapable{
	private int []arr;
	private int size;
	
	public MaxHeap(){
		arr = new int[100];
		size = 0;
	}
	
	@Override
	public void insert(int value) {
		size = size + 1;
		int index = size;
		arr[index] = value;
		
		//taking the end value to its right position
		while(index > 1) {
			int parent = index/2;
			
			if( arr[index] <= arr[parent] ) {
				return;
			}
			
			int temp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = temp;
			index = parent;
		}
	}
	
	@Override
	public void print() {
		for ( int i = 1 ; i <= size ; i++ ) {
			System.out.print( arr[i] + " ");
		}
		System.out.println("");
	}
	
	@Override
	public void delete() {
		if( size == 0 ) {
			System.out.println("nothing is present to delete ");
			return;
		}
		// put last element into first index
		arr[1] = arr[size];
		
		// remove last element 
		size--;
		
		// take root node to its correct position
		int i = 1;
		while ( i < size ) {
			int leftIndex = 2*i;
			int rightIndex = 2*i+1;
			
			
			if ( leftIndex < size && arr[i] < arr[leftIndex] ) {
				int temp = arr[i];
				arr[i] = arr[leftIndex];
				arr[leftIndex] = temp;
				i = leftIndex;
				continue;
			}
			
			if(rightIndex < size && arr[i] < arr[rightIndex]) {
				int temp = arr[i];
				arr[i] = arr[rightIndex]; 
				arr[rightIndex] = temp;
				i = rightIndex;
				continue;
			}
			
			return;
		}
		
		
	}
}
