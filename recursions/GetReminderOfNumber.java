package com.cdac.recursions;
/*
	Write recursive algorithm to find quotient after dividing two numbers.
	Using above definition, implement following function to return quotient after dividing two numbers (a / b).
	int quotient(int a, int b);
	Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
*/


public class GetReminderOfNumber {
	
		private static int remainder(int a, int b) {
			if (a < b) return a;
			else
				return remainder(a - b, b);
		}
	
		public static int remainderCall(int a, int b) {
			if (a<0 && b > 0) return -remainder(Math.abs(a), Math.abs(b));
			return remainder(Math.abs(a), Math.abs(b));
		}
		
		public static void main(String[] args) {
			int a = 11;
			int b = 3;
			
			int result = remainder(a, b);
			
			System.out.println("Remainder: " + result);
		}

}
