package com.JavaLive.Session2;

public class PracticeConstructor {
	private String Name;
	private int age;
	public PracticeConstructor(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PracticeConstructor [Name=" + Name + ", age=" + age + "]";
	}
	
	
	
}
