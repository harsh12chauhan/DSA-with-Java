package com.cdac.sorting;

public class QuickSort {
	private static int partition(int []arr,int s, int e) {
		int pivot = s;
		s = s+1;
		
		while(s<=e) {
			while( s<=e && arr[s] <= arr[pivot] ) {
				s++;
			}
			while( s<=e && arr[e] > arr[pivot] ) {
				e--;
			}
			
			if(s<e) {
				//swap(s,e)
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
			}
		}
		//swap(e,pivot);
		int temp = arr[pivot];
		arr[pivot] = arr[e];
		arr[e] = temp;
		
		return e;
	}
	
	private static void quickSort(int []arr,int s,int e) {
		// checking length of the array as array with length 1 is already sorted 
		if ( ( e - s + 1) <= 1 ) {
				return;
			}
			
			int pivotPos = partition(arr, s, e);
			
			quickSort(arr, s, pivotPos - 1);
			quickSort(arr, pivotPos + 1, e);			
	}
	public static void sort(int []arr, int size) {
		quickSort(arr,0,size-1);
	}
}
