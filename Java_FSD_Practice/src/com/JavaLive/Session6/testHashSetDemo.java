package com.JavaLive.Session6;

import java.util.*;

public class testHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("a");
		System.out.println(set1);
		
//		Set<Book> books = new HashSet<Book>();
		Set<Book> b = new TreeSet<>();
		Book b1 = new Book("RK Narayan", "Malgudi days", 1941);
		Book b2 = new Book("RK Narayan", "Malgudi days", 1942);
		Book b3 = new Book("Sanal Mishra", "Old days", 1999);
		Book b4 = new Book("Aryan Rai", "New days", 2000);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
//		System.out.println(book1.hashCode());
//		System.out.println(book2.hashCode());
	System.out.println(b);
				
		
	}
}

class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
//	public int hashCode() {
//		return title.hashCode();
//	}
//	public boolean equals(Object obj) {
//		return this.title.equalsIgnoreCase(((Book)obj).getTitle());
//	}
	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}
	
	
}
