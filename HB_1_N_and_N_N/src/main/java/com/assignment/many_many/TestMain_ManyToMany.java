package com.assignment.many_many;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.assignment.one_many.Market;

public class TestMain_ManyToMany {

		public static void insert(SessionFactory sessionFactory)
		{
			Session newSession=sessionFactory.openSession();
			Transaction t=newSession.beginTransaction();
			Course course_1=new Course("Mathematics");
			Course course_2=new Course("History");
			Set<Course> course=new HashSet<Course>();
			Set<Student> student=new HashSet<Student>();
			course.add(course_1);
			course.add(course_2);
			Student student_1=new Student("SANDEEP",course);
			Student student_2=new Student("SWADHIN",course);
			student.add(student_1);
			student.add(student_2);
			newSession.save(student_1);
			newSession.persist(student_2);
			t.commit();
			newSession.close();	
		}
		
		public static void update(SessionFactory sessionFactory)
		{
			Session newSession=sessionFactory.openSession();
			Transaction t=newSession.beginTransaction();
			Student s=newSession.load(Student.class,4L);
			s.setStudentName("Dipu");
			t.commit();
			newSession.close();	
		}
		
		public static List<Student>getAllStudent(SessionFactory sessionfactory )
		{
			 Session session =sessionfactory.openSession();
			Query query=session.createQuery("From Student");
			 List<Student> productList=query.list();
		      session.close();
		      return productList;
		}
		public static void delete(SessionFactory sessionFactory) {
			Session newSession=sessionFactory.openSession();
			Transaction t=newSession.beginTransaction();
			Student student=newSession.load(Student.class,6L);
			newSession.delete(student);
			t.commit();
			newSession.close();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory s=config.buildSessionFactory();
			//insert(s);
			//update(s);
			//read(s);
			delete(s);
			// System.out.println(getAllStudent(sessionFactory));
			s.close();
		}

	}

