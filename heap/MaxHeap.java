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
}
