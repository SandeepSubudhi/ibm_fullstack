package firstSpringApp;


public class Department {
    private String deptName;
    
    public Department() {
    	System.out.println("in const");
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}