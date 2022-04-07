package com.JavaLive.Session9;

public class SingletonPattern {


	public static void main(String[] args) {
		
		Database mydb = Database.getMyDBInstance();
		mydb.connect();
		
	}
}
