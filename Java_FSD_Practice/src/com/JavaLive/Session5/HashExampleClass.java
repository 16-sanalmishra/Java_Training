package com.JavaLive.Session5;

import java.util.Objects;

public class HashExampleClass {

	private int age;
	private String name;
	private String branch;
	private int num;
	public HashExampleClass(int age, String name, String branch, int num) {
		this.age = age;
		this.name = name;
		this.branch = branch;
		this.num = num;
	}
	public HashExampleClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name + ", branch=" + branch + ", num=" + num + "";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, branch, name, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashExampleClass other = (HashExampleClass) obj;
		return age == other.age && Objects.equals(branch, other.branch) && Objects.equals(name, other.name)
				&& num == other.num;
	}
	
	
	
	
}
