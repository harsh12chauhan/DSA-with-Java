package com.cdac.searchAndSortHelper;

public class VerifySorted {
	public static boolean isSorted(int [] arr, int size) {
		for ( int i = 1 ; i < size ; i++) {
			if( arr[i] < arr[i-1] ) {
				return false;
			}
		}
		return true;
	}
}
