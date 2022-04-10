package com.JavaLive.Session3;

import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int num = Integer.parseInt(s);
		int sum = 0;
		int i =0;
			while(num>0) {
				int temp = num%10;
				sum += ((temp) * Math.pow(2, i++));
				num = num/10;
			}
			
		
		System.out.println("The binary of " + s + " is :" + sum);
		
		sc.close();
	}
}
