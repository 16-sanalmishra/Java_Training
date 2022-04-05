package com.JavaLive.Session7;

import java.io.File;
import java.io.FilenameFilter;

public class SearchMyFile implements FilenameFilter , Comparable<SearchMyFile>{
	
	String fileName;
	
	public SearchMyFile(String fileName) {
		
		this.fileName = fileName;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.startsWith(fileName);
	}

	@Override
	public int compareTo(SearchMyFile o) {
		
		return this.fileName.compareTo(o.fileName);
	}
	

}
