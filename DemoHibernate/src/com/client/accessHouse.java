package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.House;
import com.entity.houseType;
import com.util.hibernateUtils;

public class accessHouse {

	public static void main(String[] args) {
		
		Session s = hibernateUtils.getSession().openSession();
		Transaction t = s.getTransaction();
		t.begin();
		
		houseType h1 = new houseType("type1String" , 1);
		houseType h2 = new houseType("type2String" , 2);
		House house = new House(0 , "ADM" , h1 ,h2);
		
		
		s.save(house);
		t.commit();
		s.close();
		
		
	}
}
