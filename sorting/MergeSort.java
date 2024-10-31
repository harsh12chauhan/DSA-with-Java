package com.cdac.sorting;

public class MergeSort {
	
	private static void merge(int []arr,int s,int mid,int e) {
			int s1 = s;
			int e1 = mid;
			int s2 = mid+1;
			int e2 = e;
			int [] newArr = new int[e - s + 1];
			
			int i = 0;
			
			while(s1 <= e1 && s2 <= e2) {
					if(arr[s1] <= arr[s2]) {
						newArr[i] = arr[s1];
						s1++;
					}else {
						newArr[i] = arr[s2];
						s2++;
					}
					i++;
			}
			
			while(s1 <= e1 ) {
				newArr[i] = arr[s1];
				s1++;
				i++;
			}
			
			while(s2 <= e2 ) {
				newArr[i] = arr[s2];
				s2++;
				i++;
			}
			
			//coping element of newArray into oldArray
			for ( int j = 0 ; j < i ; j++ ) {
				arr[s+j] = newArr[j];
			}
	}
	private static void mergeSort(int [] arr,int s,int e) {
		if( ( e-s+1 ) <= 1 ) {
			return ;
		}
		
		int mid = s + (e-s)/2;
		mergeSort(arr,s,mid);
		mergeSort(arr,mid + 1 , e);
		merge(arr,s,mid,e);
		
	}
	public static void sort(int []arr,int size) {
		mergeSort(arr,0,size-1);
	}
}
