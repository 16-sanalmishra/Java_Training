package com.JavaLive.Session2;

import java.util.StringTokenizer;

public class StringExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer("I am new to java language.");
		sb.append("Sanal is a very good boy...");
		sb.append("Lets check the capacity now");
		System.out.println(sb);
		System.out.println(sb.capacity());
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		System.out.println();
		
		
	}
}
