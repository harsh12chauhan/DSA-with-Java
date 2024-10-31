package com.cdac.searching;

public class LinearSearch {
	public static boolean search(int []arr,int size,int element){
			
		for ( int i = 0 ; i < size ; i++) {
			System.out.println("ele: "+arr[i]);
			if ( element == arr[i] ) {
				return true;
			}
		}
			return false;
	}
}
