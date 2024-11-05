package com.cdac.stack.stackMain;

import com.cdac.stack.impl.MyStackClass;
import com.cdac.stack.interfaces.MyStack;

public class StackMain {

	public static void main(String[] args) {
		MyStack st = new MyStackClass();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		while(!st.isEmpty()) {			
			System.out.println(st.top());
			st.pop();
		}
		
		System.out.println(st.top());
	}
}
