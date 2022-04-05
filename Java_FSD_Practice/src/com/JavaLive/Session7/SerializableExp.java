package com.JavaLive.Session7;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExp {
	private static final String filePath = "C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\out\\testSerialiableFile.txt";

	public static void main(String[] args) {
		SerializabeObject so = new SerializabeObject(21, "Sanal");
	try {
			FileOutputStream fo = new FileOutputStream(filePath);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(so);
			os.close();
			fo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
