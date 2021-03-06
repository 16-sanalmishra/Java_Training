package com.JavaLive.Session7;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	private static final String filePath = "C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\out\\testFile.txt";

	public static void main(String[] args) {

		String s = "Hello from the new File just got created....!!!";
		fileWriterExample();

		try {
			FileOutputStream fo = new FileOutputStream(filePath);
			// fo.write(65);
			fo.write(s.getBytes());
			System.out.println("File Created Successfully...!!!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fi = new FileInputStream(filePath);
			// System.out.println((char)fi.read());
			int i = 0;
			int count = 0;
			while ((i = fi.read()) != -1 && count <= 10) {
				System.out.print((char) i);
				count++;
			}

			fi.close();
		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// fileReadExample();
	}

	private static void fileReadExample() {
		try {
			FileReader f = new FileReader(filePath);
			int i = 0;
			while ((i = f.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void fileWriterExample() {

		try {
			FileWriter f = new FileWriter(filePath, true);
			f.append("Hi from FileWriter........");
			BufferedWriter b = new BufferedWriter(f);
			b.write("Hii from Buffered Writer...");
			System.out.println("Done");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
