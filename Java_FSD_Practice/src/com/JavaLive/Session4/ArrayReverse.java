package com.JavaLive.Session4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		for(int i= n-1; i>= 0; i--) {
			System.out.println(arr[i]);
		}
		int [] newArr = new int[n];
		newArr = Arrays.copyOf(arr, n);
		System.out.println(Arrays.toString(newArr));
 }
}
