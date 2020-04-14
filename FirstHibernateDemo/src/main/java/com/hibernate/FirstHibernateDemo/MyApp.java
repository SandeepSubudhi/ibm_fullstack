package com.hibernate.FirstHibernateDemo;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class MyApp {
	public static void insert(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      transcation.begin();
	      Product product=new Product("HELMATE", 2000);
	      Long productId=(Long)session.save(product);
	      System.out.println("Product  id="+productId);
	      transcation.commit();
	      session.close();
	}
	public static void update(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      transcation.begin();
	      Product product=session.load(Product.class, 1L);
	      product.setName("Hockey");
	      transcation.commit();
	      session.close();
	}
	public static void delete(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      transcation.begin();
	      Product product=session.load(Product.class, 1L);
	      session.delete(product);
	      transcation.commit();
	      session.close();
	}
	//Assignment-1(a)
	public static void TestLoadVsGet(SessionFactory sessionfactory)
	{
		 Session session =sessionfactory.openSession();
	      Transaction transcation =session.beginTransaction();
	      transcation.begin();
	    //  Product product=session.load(Product.class, 1L);//using Load()
	      Product product=session.get(Product.class, 1L);//using Get()
	      product.setName("Hockey");
	      transcation.commit();
	      session.close();
	}
	//Assignment-1(b)
		public static void testSaveVsPersist(SessionFactory sessionfactory)
		{
			 Session session =sessionfactory.openSession();
		      Transaction transcation =session.beginTransaction();
		      transcation.begin();
		      Product product=new Product("Football", 3000);
		     /* Long productId=(Long)session.save(product);//using save()
		      System.out.println("Product  id="+productId);*/
		      session.persist(product);//Using persist()
		      System.out.println("Product  id="+product.getId());
		      transcation.commit();
		      session.close();
		}
	//Assignment-1(c)
	public static void updateVsMerge(SessionFactory sessionFactory) {
		Session session =sessionFactory.openSession();
	    Transaction transcation =session.beginTransaction();
	    transcation.begin();
	    Product product=session.get(Product.class,2L);
	    transcation.commit();
	    sessionFactory.close();
		
		product.setName("Table");
		    product.setName("Table");
			session =sessionFactory.openSession();
			transcation =session.beginTransaction();
			    transcation.begin();
			     product=session.load(Product.class,2L);
			   // session.merge(product);//using merge();
			     session.update(product);//using update;
			    transcation.commit();
			    sessionFactory.close();
			    
	}
	//Assignment-1(d)
	  public static void insertUsingSql(SessionFactory sessionFactory)
	  {
		  Session session =sessionFactory.openSession();
		  //session.beginTransaction();
		  Query query=session.createSQLQuery("INSERT INTO PRODUCT_MASTER VALUES(2,'Golf',2000)");
		  query.executeUpdate();
		  session.close();
	  }
	public static List<Product>getAllProducts(SessionFactory sessionfactory )
	{
		 Session session =sessionfactory.openSession();
		 Query query=session.createQuery("GET_ALL_PRODUCT");//Using NamedQuery
		// Query query=session.createQuery("From Product");
		 List<Product> productList=query.list();
	      session.close();
	      return productList;
	}
	//ASSIGNMENT-2(a)
	public static List<Product>gettotalPrice(SessionFactory sessionfactory )
	{
		 Session session =sessionfactory.openSession();
		 Query query=session.createQuery("SELECT SUM(p.price) FROM Product p");
		 List<Product> productList=query.list();
	      session.close();
	      return productList;
	}
	//ASSIGNMENT-2(b)
	public static List<Product>getallorderbyprice(SessionFactory sessionfactory )
	{
		 Session session =sessionfactory.openSession();
		 //USING HQL
		/* Query query=session.createQuery("FROM 	Product p ORDER BY p.price DESC");
		 List<Product> productList=query.list();
		  session.close();
	      return productList;*/
		 //USING CRITERIA
		 Criteria cr = session.createCriteria(Product.class);
		 cr.addOrder(Order.desc("price"));
		 List results = cr.list();
		 session.close();
	      return results;
	}
	//ASSIGNMENT-2(c)
		public static List<Product>groupByName(SessionFactory sessionfactory )
		{
			 Session session =sessionfactory.openSession();
			 Query query=session.createQuery("FROM Product E GROUP BY E.name");
			 List<Product> productList=query.list();
		      session.close();
		      return productList;
		}
		//ASSIGNMENT-2(d)
		public static List<Product>averagePrice(SessionFactory sessionfactory )
		{
			 Session session =sessionfactory.openSession();
			 Query query=session.createQuery("SELECT avg(p.price) FROM Product p");
			 List<Product> productList=query.list();
		      session.close();
		      return productList;
		}
		//ASSIGNMENT-2(e)
				public static List<Product>PriceAboveTwoThaosand(SessionFactory sessionfactory )
				{
					 Session session =sessionfactory.openSession();
					 Criteria cr = session.createCriteria(Product.class);
					 cr.add(Restrictions.gt("price", 2000.00));
					 List results = cr.list();
				      session.close();
				      return results;
				}
		
	public static void main(String[] args) throws Exception
	{ 
      Configuration configuration =  new Configuration();
      configuration.configure("hibernate.cfg.xml");
      SessionFactory sessionFactory = configuration.buildSessionFactory();
    // insert(sessionFactory);
    // update(sessionFactory);
     //delete(sessionFactory);
      //testSaveVsPersist(sessionFactory);
     //TestLoadVsGet(sessionFactory);
    // updateVsMerge(sessionFactory);
    // insertUsingSql(sessionFactory);
      // System.out.println(getAllProducts(sessionFactory));
     // System.out.println(gettotalPrice(sessionFactory));
    //  System.out.println(getallorderbyprice(sessionFactory));
     // System.out.println(groupByName(sessionFactory));
    //  System.out.println(averagePrice(sessionFactory));
      System.out.println(PriceAboveTwoThaosand(sessionFactory));
      sessionFactory.close();
	}
}