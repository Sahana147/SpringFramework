package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepositoryImpl  implements FoodItemRepository{

	public FoodItemRepositoryImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("Invoked save");
		System.out.println("Implmentation using JPA");
		Configuration configuration = new Configuration();
		configuration.configure();
		// configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(entity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		sessionFactory.close();

		
	}

}
