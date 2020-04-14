package firstSpringApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"auto.xml"});
         

		Employee emp = context.getBean("employee", Employee.class);
		
		emp.showEployeeDetails();
     
		
		
	}

}