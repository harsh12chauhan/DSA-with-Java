package com.cdac.recursions;
/*
	Write recursive algorithm to find quotient after dividing two numbers.
	Using above definition, implement following function to return quotient after dividing two numbers (a / b).
	int quotient(int a, int b);
	Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
*/


public class GetQuotientOfNumber {
	
		public static int quotient(int a, int b) {
			if(a == 0)return 0;
			if(b == 1)return a;
			if(b == 0)return -1;
			if(a < b)return 0;
			
			return 1 + quotient(a-b, b);
		}
	
		public static int divide(int a, int b) {
			if((a>0 && b>0) || (a<0 && b>0)) {
				return quotient(Math.abs(a), Math.abs(b));
			}
			return -quotient(Math.abs(a), Math.abs(b));			
		}
		
		
		public static void main(String[] args) {
			int a = 10;
			int b = 3;
			
			int result = divide(a, b);
			
			System.out.println("Quotient: " + result);
		}

}
