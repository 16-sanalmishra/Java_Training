package com.JavaLive.Session6;

import java.util.HashSet;
import java.util.Set;

import com.JavaLive.Session5.HashExampleClass;

public class HashSetExample {

	

	public static void main(String[] args) {
		
		HashExampleClass h1 = new HashExampleClass(20 , "Sanal" , "CSE" , 80005);
		HashExampleClass h2 = new HashExampleClass(20 , "Sanal" , "CSE" , 80005);
		HashExampleClass h3 = new HashExampleClass(20 , "Sanal" , "CSE" , 80005);
		HashExampleClass h4 = new HashExampleClass(20 , "Sanal" , "CSE" , 80005);
		HashExampleClass h5 = new HashExampleClass(20 , "Sanal" , "CSE" , 80005);
		HashExampleClass h = new HashExampleClass();
		
		Set<HashExampleClass> s = new HashSet<>();
		s.add(h1);
		s.add(h2);
		s.add(h3);
		s.add(h4);
		s.add(h5);
		//System.out.println(s.toString());
		
		System.out.println(s.size());
		System.out.println(s);
		
		
		
	}

	


		
	}

