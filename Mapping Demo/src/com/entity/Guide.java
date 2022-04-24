package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guide {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String gName;
	@Column (name = "S_ID")
	private int staff_id;
	
	@OneToMany
	(mappedBy = "guide", cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
	List<Student> student = new ArrayList<Student>();
	
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public Guide(String gName, int staff_id) {
		this.gName = gName;
		this.staff_id = staff_id;
	}
	public Guide() {
	}
	public List<Student> getStudent() {
		return student;
	}
	
}
