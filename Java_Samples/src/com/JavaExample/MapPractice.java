package com.JavaExample;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sanal");
		map.put(2, "Aryan");
		map.put(3, "Vaibhav");
		map.put(4, "Vishal");
		map.put(5, "Aryaman");
		map.put(5, "Lodu");
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		map.put(6, "Loda");
		System.out.println(map);
		System.out.println(map.keySet());


	}
}
