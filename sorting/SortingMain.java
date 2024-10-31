package com.cdac.sorting;

import com.cdac.searchAndSortHelper.PrintArrayElements;
import com.cdac.searchAndSortHelper.VerifySorted;

public class SortingMain {

	public static void main(String[] args) {
		int [] arr = {3,8,2,4,6,9,7,1,5,0};
		int size = 10;
		
		// bubble sort =========================
//		System.out.println("bubble sort =========================");
//		PrintArrayElements.display(arr, size);
//		BubbleSort.sort(arr, size);		
//		PrintArrayElements.display(arr, size);
		
		// insertion sort =========================
//		System.out.println("insertion sort =========================");
//		PrintArrayElements.display(arr, size);
//		InsertionSort.sort(arr, size);
//		PrintArrayElements.display(arr, size);
		
		
		// quick sort =========================
		System.out.println("quick sort =========================");
		PrintArrayElements.display(arr, size);
		QuickSort.sort(arr, size);
		PrintArrayElements.display(arr, size);
		
		// merge sort =========================
//		System.out.println("merge sort =========================");
//		PrintArrayElements.display(arr, size);
//		MergeSort.sort(arr, size);
//		PrintArrayElements.display(arr, size);
		
		if ( VerifySorted.isSorted(arr, size) ){
			System.out.println("Sorted!!");
		}else {
			System.out.println("Not Sorted!!");			
		}
	}

}
