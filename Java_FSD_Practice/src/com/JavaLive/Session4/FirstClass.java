package com.JavaLive.Session4;

public class FirstClass implements IExample{

	@Override
	public void sayHi() {
		System.out.print("Hi");
		
	}

	@Override
	public void getName(String name) {
		System.out.print(" " + name);
		
	}

	

}
