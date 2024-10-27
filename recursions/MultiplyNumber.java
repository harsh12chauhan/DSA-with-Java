package com.cdac.recursions;

//Write recursive algorithm to find quotient after dividing two numbers.
//Using above definition, implement following function to return quotient after dividing two numbers (a / b).
//int quotient(int a, int b);
//Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.


public class MultiplyNumber {
	
		public static int multiply(int a, int b) {
			if(b == 1)return a;
			if(a == 1)return b;
			if( a == 0 && b == 0)return 0;
			
			return a + multiply(a,b-1);
		}
	
		public static int getMultiply(int a, int b) {
			if((a>0 && b>0) || (a<0 && b>0)) {
				return multiply(Math.abs(a), Math.abs(b));
			}
			return -multiply(Math.abs(a), Math.abs(b));			
		}
		
		
		public static void main(String[] args) {
			int a = 0;
			int b = 2;
			
			int result = getMultiply(a, b);
			
			System.out.println("Quotient: " + result);
		}

}
