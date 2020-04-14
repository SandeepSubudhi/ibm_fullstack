package com.assignment.one_one;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class TestMain {
	public static void insert(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation1 =session.beginTransaction();
	      Enquiry enquiry=new Enquiry("what is my account balance?");
	      Customer customer=new Customer("Sandeep",enquiry);
	      session.persist(customer);
	      //System.out.println("Product  id="+productId);
	      transcation1.commit();
	      session.close();
	}
	public static void update(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      Customer customer=session.load(Customer.class, 2L);
	      //Enquiry enquiry=session.get(Enquiry.class,3L);
	      customer.setName("DIPU");
	     customer. getEenquiry().setEnq_ques("What is this ?");
	      transcation.commit();
	      session.close();
	}
	public static void delete(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      Customer customer=session.load(Customer.class, 1L);
	      //Enquiry enquiry=session.get(Enquiry.class,3L);
	      session.delete(customer);
	    // customer. getEenquiry().setEnq_ques("What is this ?");
	      transcation.commit();
	      session.close();
	}
	
public static List<Customer>getAllCustomer(SessionFactory sessionfactory )
	{
		 Session session =sessionfactory.openSession();
		Query query=session.createQuery("From Customer");
		 List<Customer> productList=query.list();
	      session.close();
	      return productList;
	}
	public static void main(String[] args) {
		 Configuration configuration =  new Configuration();
	      configuration.configure("hibernate.cfg.xml");
	      SessionFactory sessionFactory = configuration.buildSessionFactory();
	     // insert(sessionFactory);
	   //  update(sessionFactory);
	      delete(sessionFactory);
	      System.out.println(getAllCustomer(sessionFactory));
	      sessionFactory.close();

	}

}
