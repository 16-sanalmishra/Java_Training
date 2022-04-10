package com.JavaExample;

import java.util.HashMap;
import java.util.Map;

public class MapInMap {
	public static void main(String[] args) {
		
		Map<String , Map<String , Integer>> profile = new HashMap<String , Map<String , Integer>>();
		Map<String , Integer> uprofile = new HashMap<String , Integer>();
		
		uprofile.put("Sanal" , 1);
		uprofile.put("Aryan" , 2);
		uprofile.put("Vaibhav" , 3);
		uprofile.put("Vishal" , 4);
		uprofile.put("Aryaman" , 5);
		uprofile.put("Lodu" , 6);
		
		profile.put("First", uprofile);
		System.out.println(profile);
	}
	
}
