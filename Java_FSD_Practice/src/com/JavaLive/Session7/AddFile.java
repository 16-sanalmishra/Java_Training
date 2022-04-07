package com.JavaLive.Session7;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AddFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fileName you want to add....");
		String n = sc.nextLine();

		String filePath = "C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\src\\com\\JavaLive\\Session8"
				+ "\\" + n;

		try {
			FileOutputStream f = new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}
}
