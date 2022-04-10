package com.JavaExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<Integer>();
		for(int i=0; i<10; i++) {
			st1.push(i);
		}

		for(int i=0; i<10; i++) {
			System.out.print(st1.pop() + "|");
		}
		
	}
}
