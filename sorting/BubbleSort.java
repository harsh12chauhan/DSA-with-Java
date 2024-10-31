package com.cdac.sorting;

import com.cdac.searchAndSortHelper.VerifySorted;

public class BubbleSort {
	public static void sort ( int []arr , int size ) {
		
		for ( int i = 0 ; i < size ; i++ ) {
			if ( VerifySorted.isSorted(arr, size) ) {
				return ;
			}
			for ( int j = i+1 ; j < size ; j++ ) {
					if( arr[i] < arr[j] ) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
			}
		}
	}
}
