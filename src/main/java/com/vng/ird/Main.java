package com.vng.ird;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSession();
		Session session = sessionFactory.openSession();
	}

}
