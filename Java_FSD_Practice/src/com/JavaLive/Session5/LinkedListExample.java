package com.JavaLive.Session5;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(14);
		ll.add(15);
		
		printList(ll);
		print(ll);
		
	}

	private static void print(List<Integer> ll) {
		// TODO Auto-generated method stub
		Iterator<Integer> it = ll.iterator(); 
		System.out.println(ll);
		
	}

	private static void printList(List<Integer> ll) {
		// TODO Auto-generated method stub
		Iterator<Integer> it = ll.iterator(); 
		while(it.hasNext()) {
			int a = it.next();
			if(a == 14) {
				it.remove();
			}
			
			
			
			
		
		
		
	}
}
}
