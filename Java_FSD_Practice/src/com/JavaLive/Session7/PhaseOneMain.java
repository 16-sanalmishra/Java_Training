package com.JavaLive.Session7;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PhaseOneMain {
	public static void main(String[] args) {
		SearchMyFile s = new SearchMyFile("filesExamples.java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of the Directory you want to search in........!!!!!!!");

		// Will Display All The Files Available In The Directory.
		String filePath = displayTheAvailables(sc);

		File file = new File(filePath);
		String[] fileList = file.list();

		List<String> l = Arrays.asList(fileList);
		Set<List> hl = new HashSet<List>();
		hl.add(l);
	

		System.out.println("Here are the files from the directory....");
		for (List i : hl) {
			System.out.println(i);
		}
		



	}

	private static void checkFileAvailability(Set<List> hl, SearchMyFile s) {
		if (hl.contains(s)) {
			System.out.println("File Found");
		} else {
			System.out.println("File Not Found");
		}

	}

	private static String displayTheAvailables(Scanner sc) {
		String fP = sc.nextLine();
		return fP;
	}
}
