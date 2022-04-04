package com.JavaLive.Session5;

import java.util.*;

public class PracticeArrayList {
	private String name;
	private int age;
	private double weigth;
	
	public PracticeArrayList(String name, int age, double weigth) {
		this.name = name;
		this.age = age;
		this.weigth = weigth;
	}
	
	
	public PracticeArrayList() {
		this(null,0,0.0);
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public static void codeStarts() {
		System.out.println("The code is getting Generated............");
		System.out.println("-----------------------------------------");
	}


	@Override
	public String toString() {
		return "PracticeArrayList [name=" + name + ", age=" + age + ", weigth=" + weigth + "]";
	}
	
	
	
	
	
	
}
