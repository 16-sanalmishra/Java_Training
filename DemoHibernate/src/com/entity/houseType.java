package com.entity;

import javax.persistence.Embeddable;

@Embeddable
public class houseType {

	private String type;
	private int no;
	public houseType(String type, int no) {
		this.type = type;
		this.no = no;
	}
	public houseType() {
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
