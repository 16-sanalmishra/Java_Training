package com.JavaLive.Session2;

public class TestingGenericClass <T>
{ 
	T obj;
	 TestingGenericClass(T obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	 public T display() {
		 return this.obj;
	 }
	 public static void main(String[] args) {
		TestingGenericClass<Integer> tg = new TestingGenericClass<>(10);
		System.out.println(tg.display());
		System.out.println(tg.hashCode());
	}
}
