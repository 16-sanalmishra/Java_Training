package com.JavaLive.Session8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("san");
		Matcher m = p.matcher("Sanal");
		System.out.println(m.matches());
		System.out.println(Pattern.matches("[anm]?" , "a"));
		System.out.println(Pattern.matches("[anm]+" , "aa"));
		System.out.println(Pattern.matches("[anm]*" , "aaaa"));
		
	}
}
