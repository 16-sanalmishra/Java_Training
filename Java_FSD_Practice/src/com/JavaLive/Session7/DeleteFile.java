package com.JavaLive.Session7;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the File Name You Want To Delete ");
		String fileName = sc.nextLine();
		
		try {
			File f = new File("C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\src\\com\\JavaLive\\Session8"+"\\"+fileName);
			if(f.delete()) {
			
				System.out.println("Congratulations " + f.getName() + " Deleted Successfully");
			}
			else {
				System.out.println("Sorry but " + f.getName() + " Doesn't exist");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}
}
