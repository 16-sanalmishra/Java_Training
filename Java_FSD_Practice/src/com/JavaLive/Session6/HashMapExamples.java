package com.JavaLive.Session6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
		

	Map<Integer, String> m = new HashMap<Integer , String>();
	m.put(1 ,"Sanal");
	m.put(2, "Aryan");
	m.put(3 ,"Vishal");
	m.put(4, "Aryaman");
	
	System.out.println(m);
	System.out.println(m.get(1));
	Set<Integer> s = m.keySet();
	
	for(Integer s1 : s) {
		System.out.println(m.get(s1));
	}
	
	
	
}
}
