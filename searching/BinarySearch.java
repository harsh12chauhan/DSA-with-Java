package com.cdac.searching;

import com.cdac.searchAndSortHelper.VerifySorted;

public class BinarySearch {
	public static boolean search(int []arr,int size,int element){
			int s = 0;
			int e = size - 1;
			
			if ( !VerifySorted.isSorted( arr,size ) ) {
				System.out.println("Array is not sorted");
				return false;
			}
			
			while(s<e) {
				int mid = s + (e-s)/2;
				
				if( arr[mid] == element ){
					return true;
				}else if( arr[mid] > element ) {
					e = mid - 1;
				}else {
					s = mid + 1;
				}
			}
			
			return false;
	}
}
