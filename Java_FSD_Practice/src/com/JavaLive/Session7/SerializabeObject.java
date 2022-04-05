package com.JavaLive.Session7;

import java.io.Serializable;

public class SerializabeObject implements Serializable {

	private int age;
	String name;
	public SerializabeObject(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

}
