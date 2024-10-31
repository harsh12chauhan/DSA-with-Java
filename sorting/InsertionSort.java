package com.cdac.sorting;

public class InsertionSort {
	public static void sort(int [] arr,int size) {
		for ( int i = 1 ; i < size ; i++ ) {
			
			int element = arr[i];
			
			int j = 0;
			for ( j = i-1 ; j >= 0 ; j-- ) {
				 if(element > arr[j]) {
					 arr[j+1] = arr[j];
				 }else {
					 break;
				 }
			}
			
			arr[j+1] = element;
		}
	}
}	
