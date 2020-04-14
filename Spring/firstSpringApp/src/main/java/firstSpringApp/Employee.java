package firstSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	   

	
	@Autowired
	@Qualifier("dept1")
    private Department department;
	private String ename;
   
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void showEployeeDetails(){
        
        System.out.println("Employee Name : " + ename);
        System.out.println("Department : " + department.getDeptName());
    }
}