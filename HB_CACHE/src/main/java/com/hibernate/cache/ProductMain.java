package com.hibernate.cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {

	public static void insert(SessionFactory sessionFactory) {
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	Product product=new Product("Cricket kit",6500);
	session.persist(product);
	transaction.commit();
	session.close();
}
	public static void getTheValue(SessionFactory sessionFactory) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=session.get(Product.class,1L);
		Product product1=session.get(Product.class,1L);
		System.out.println(product);
		System.out.println(product1);
		transaction.commit();
		session.close();
	}
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		//insert(sessionFactory);
		getTheValue(sessionFactory);
		sessionFactory.getCache().evictEntity(Product.class, 1L);
	Session session1=sessionFactory.openSession();
		Transaction transaction=session1.beginTransaction();
	Product product=session1.get(Product.class,1L);
	System.out.println(product);
		transaction.commit();
		session1.close();
		sessionFactory.close();
	}

}
