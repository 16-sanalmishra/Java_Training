package com.JavaLive.Session3;

public class PracticeInheritence {
	private String name;
	private int age;
	private double weight;
	public PracticeInheritence(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void sayHi() {
		System.out.println("Hi from the Super Class ");
	}
	
	public void identity() {
		System.out.println("The person is "+ getName() + " and his age is "+ getAge());
	}
	public PracticeInheritence() {
		super();
	}
}
