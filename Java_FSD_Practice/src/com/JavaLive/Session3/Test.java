package com.JavaLive.Session3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PracticeInheritence pi = new PracticeInheritence();
		String s = sc.nextLine();
		pi.setName(s);

		int n = sc.nextInt();
		pi.setAge(n);
		PracticeInheritence pi1 = new PracticeInheritence(s, n, 68.70);

		System.out.println(pi1.getAge());
		System.out.println(pi1.getName());
		
	}
}
