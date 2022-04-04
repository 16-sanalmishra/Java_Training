package com.JavaLive.Session5;

import java.util.*;



public class PracticeExamples {
	public static void main(String[] args) {
		letsGetData d1 = new letsGetData(1, "Sanal");
		letsGetData d2 = new letsGetData(22, "Aryan");
		letsGetData d3 = new letsGetData(10, "Sonal");
		letsGetData d4 = new letsGetData(0, "Sakshi");
		letsGetData d5 = new letsGetData(1, "Sohak");
		letsGetData d6 = new letsGetData(100, "Snehil");
		
		Set<letsGetData> si = new TreeSet<>();
		si.add(d1);
		si.add(d2);
		si.add(d3);
		si.add(d4);
		si.add(d5);
		si.add(d6);
		System.out.println(si.size());
		System.out.println("------------------------------");
		printAll(si);
		System.out.println("------------------------------");
		letsGetData l = new letsGetData(90 , "RKS");
		System.out.println(l.toString());
	
	
	
	}
	

	static void printAll(Set<letsGetData> si) {
		// TODO Auto-generated method stub
		for(letsGetData d : si) {
			System.out.println(d);
		}
	}
}


	

	
	

