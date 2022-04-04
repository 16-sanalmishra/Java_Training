package com.JavaLive.Session1;

public class TypeCasting {
	public void typeCast() {
		char s2 = 'A';
		int n = (int) s2;
		System.out.println(n);

		long l = n;
		System.out.println(l);

		char c = (char) n;
		System.out.println(c);

		// String s = "Sanal";

		// System.out.println(s);
		int a = 0;
		try {
			a = Integer.parseInt("25T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);

	}
}
