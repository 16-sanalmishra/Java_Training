package com.JavaLive.Session6;

import java.util.NavigableSet;
import java.util.*;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>(); 
		ns.add(76);
		ns.add(7);
		ns.add(766);
		ns.add(6);
		ns.add(0);
		System.out.println(ns);
		System.out.println(ns.size());
		
		System.out.println(ns.ceiling(7));
		
		NavigableSet<Integer> hs = ns.headSet(76,true);
		System.out.println(hs);
	}
}
