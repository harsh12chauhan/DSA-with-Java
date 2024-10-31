package com.cdac.searching;

import com.cdac.searchAndSortHelper.VerifySorted;
import com.cdac.sorting.InsertionSort;

public class SearchingMain {

	public static void main(String[] args) {
		int [] arr = {3,8,2,4,6,9,7,1,5,0};
		int size = 10;
		
		
		if ( VerifySorted.isSorted(arr, size) ){
			System.out.println("Sorted!!");
		}else {
			System.out.println("Not Sorted!!");			
		}
		
		if( LinearSearch.search(arr,size,5) ) {
			System.out.println("Element found in linear search");
		}else{
			System.out.println("Element not found in linear search");
		}
		
		
		if ( VerifySorted.isSorted(arr, size) ){
			System.out.println("Sorted!!");
		}else {
			InsertionSort.sort(arr, size);			
		}
		
		if ( BinarySearch.search(arr,size,5) ) {
			System.out.println("Element found in binary search");
		}else{
			System.out.println("Element not found in binary search");
		}
		
	}

}
