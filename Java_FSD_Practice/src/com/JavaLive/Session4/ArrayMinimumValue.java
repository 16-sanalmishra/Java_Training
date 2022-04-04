package com.JavaLive.Session4;

import java.util.Scanner;

public class ArrayMinimumValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		int a=Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] < a) {
				a=arr[i];
				
			}
			
		}
		
		System.out.println(a);
	}

}
