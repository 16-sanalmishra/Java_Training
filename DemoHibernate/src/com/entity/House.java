package com.entity;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "HouseNumber")
	private int houseNum;

	@Column(name = "Area")
	private String area;

	@Embedded
	@AttributeOverrides ( {
		@AttributeOverride (name="type",column =@Column(name="hType")),
		@AttributeOverride (name="no",column =@Column(name="No"))})
	private houseType type1;
	
	@Embedded   
	@AttributeOverrides ( {
	@AttributeOverride (name="type",column =@Column(name="newType")),
	@AttributeOverride (name="no",column =@Column(name="Type2No"))
						})
	private houseType type2;

	public House(int houseNum, String area, houseType type1 , houseType type2) {
		this.houseNum = houseNum;
		this.area = area;
		this.type1 = type1;
		this.type2 = type2;
	}

	public House() {
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public houseType getType() {
		return type1;
	}

	public void setType(houseType type) {
		this.type1 = type;
	}

}
