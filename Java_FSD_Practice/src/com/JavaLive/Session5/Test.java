package com.JavaLive.Session5;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PracticeArrayList pa1 = new PracticeArrayList();
		List<PracticeArrayList> pa2 = new LinkedList<>();
		
		
		pa1.codeStarts();
		System.out.println("Enter the information......");
		String s = sc.nextLine();
		int n = sc.nextInt();
		double w = sc.nextDouble();
		PracticeArrayList pa3 = new PracticeArrayList(s, n, w);
		pa2.add(pa3);
		
		System.out.println(pa2);
	
		
		
		
		
		
		
		
		
		
	}

	
}
