package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Guide;
import com.entity.Student;
import com.util.hibernateUtils;

public class accessMe {

	public static void main(String[] args) {
		Session s = hibernateUtils.getSession().openSession();
		Transaction t = s.getTransaction();
		t.begin();
		Guide guide = s.get(Guide.class, 1);
		Student sonal = new Student("Sonal", 12 ,guide);
		Student ayushi = new Student("Ayushi", 12 ,guide);
		
		guide.getStudent().add(sonal);
		guide.getStudent().add(ayushi);
		
		s.persist(guide);
		
		t.commit();

	}
	
}
