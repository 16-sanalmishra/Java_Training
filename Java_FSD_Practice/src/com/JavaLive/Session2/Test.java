package com.JavaLive.Session2;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		

//		PracticeConstructor pc = new PracticeConstructor("Sanal", 20);
//		System.out.println(pc.getAge());
//		System.out.println(pc.getName());
//		System.out.println(pc.toString());
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Details : ");
//		String s = sc.nextLine();
//		int n = sc.nextInt();
//		
//		
//		PracticeConstructor pc1 = new PracticeConstructor(s, n);
//		System.out.println(pc1.getAge());
//		System.out.println(pc1.getName());
//		System.out.println(pc1.toString());
		
		PracticeThread pt = new PracticeThread();
		pt.start();
		
		System.out.println(pt.getPriority());
		pt.setPriority(10);
		System.out.println(pt.getPriority());
		pt.stop();
		
		
	}
}