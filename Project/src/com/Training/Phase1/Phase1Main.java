package com.Training.Phase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Phase1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t\t" + "Hello And Welcome to PathMyFile.com" + "\n");
		System.out.println("\t\t\t\t\t\t\t" + "Developed By: Sanal Mishra" + "\n");
		System.out.println("Please enter the path of the directory. ");
		String filePath = sc.nextLine();
		int r = displayOperations(sc);

		while (true) {
			switch (r) {
			case 1: {
				System.out.println("Listing the files in the given directory...!!!");
				Set<String> l1 = displayFiles(filePath);
				Iterator itr = l1.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;

			}

			case 2: {

				System.out.println("Enter the file name that you want to add.");
				sc.nextLine();

				String fName = sc.nextLine();
				String escaped = filePath.replace("\\", "\\\\");
				addFile(escaped + "\\" + fName);
				System.out.println("Your file got successfully added.");
				break;
			}
			case 3: {
				System.out.println("Enter the fileName you want to search.");
				sc.nextLine();
				String fName = sc.nextLine();
				Set<String> l1 = displayFiles(filePath);

				checkFileAvailability(l1, fName);
				break;
			}
			case 4: {
				System.out.println("Enter the file name that you want to delete.");
				sc.nextLine();
				String escaped = filePath.replace("\\", "\\\\");
				String fName = sc.nextLine();
				deleteFiles(filePath + "\\" + fName);

				break;
			}
			case 5: {
				System.out.println("Thank You..!!");
				return;
			}

			default:
				break;
			}
			System.out.print("Do you want to perform more operations ?" + " Enter Yes or No" + "\n");
			sc.nextLine();
			String s = sc.nextLine();
			if (s.equals("Yes")) {
				r = displayOperations(sc);

			} else if (s.equals("No")) {
				break;
			} else {
				System.out.println("Not a valid answer.");
				break;
			}
		}
		System.out.println("Thank You !!");

	}

	private static void addFile(String filePath) {
		try {

			FileOutputStream f = new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	private static int displayOperations(Scanner sc) {
		System.out.println("Please Enter The Number Of The Operation You Wish To Perform......." + "\n");
		System.out.println("1.Retrieve all the files available in the particular directory." + "\n"
				+ "2.If you want to add a file in the particular directory." + "\n"
				+ "3.If you want to search a file in the particular directory." + "\n"
				+ "4.If you want to delete the file in the particular directory." + "\n" + "5.If you want to exit."
				+ "\n");
		int response = sc.nextInt();
		return response;
	}

	private static Set<String> displayFiles(String filePath) {
		File file = new File(filePath);
		String[] fileList = file.list();

		List<String> l = Arrays.asList(fileList);
		Collections.sort(l);
		
		Set<String> h = new TreeSet<String>();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			h.add((String) it.next());
		}
		return h;

	}

	private static void checkFileAvailability(Set<String> hl, String fName) {

		if (hl.contains(fName)) {
			System.out.println("File Found");
		} else {
			System.out.println("Not Found");
		}

	}

	private static void deleteFiles(String filePath) {

		try {
			Files.deleteIfExists(Paths.get(filePath));
		} catch (NoSuchFileException e) {
			System.out.println("No such file/directory exists");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
		}

		System.out.println("Deletion successful.");
	}

}
