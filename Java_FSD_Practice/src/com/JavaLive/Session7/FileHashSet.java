package com.JavaLive.Session7;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FileHashSet {
public static void main(String[] args) {
	File file = new File("C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\src\\com\\JavaLive\\Session7");
	Set<File> hf = new HashSet<>();
	hf.add(file.getAbsoluteFile());
	for(File i : hf) {
		System.out.println(i.toString());
		
	}

	
} 
}
