package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.colonyDetails;
import com.util.hibernateUtils;

public class accessClass {

	public static void main(String[] args) {
		
		Session s = hibernateUtils.getSession().openSession();
		Transaction t = s.getTransaction();
		t.begin();
		
		colonyDetails cd = new colonyDetails("ADM Colony" , "231218");
		s.save(cd);
		t.commit();
		
		s.close();
		
		
	}
}
