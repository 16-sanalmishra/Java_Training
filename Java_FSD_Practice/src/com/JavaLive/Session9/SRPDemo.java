package com.JavaLive.Session9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SRPDemo {

	public static void main(String[] args)  {
		String filePath = "C:\\Users\\sanamishra\\eclipse-workspace\\Java_FSD_Practice\\src\\com\\JavaLive\\Session1\\textOut.txt";	
		
		Journal j = new Journal();
		j.addEntry("go for a run");
		j.addEntry("buy milk");
		System.out.println(j);
		
		FileSaver fs = new FileSaver();
		try {
			fs.save(j, filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Journal {
	private List<String> entries = new ArrayList<String>();
	private int count = 0;
	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);	
	}
	public void removeEntry(int index) {
		entries.remove(index);
	}
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}	
}

class FileSaver {
	public void save(Journal j, String filename) throws FileNotFoundException {
		PrintStream out = new PrintStream(filename);
		out.println(j.toString());
	}
}