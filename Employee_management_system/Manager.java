package Employee_management_system;

public class Manager extends Employee{
		
	private int deptNumber;
	
	public Manager(){
		super();
	}
	
	
	public int getDeptNumber() {
		return deptNumber;
	}
	
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	
	public double CalculateSalary() {
		return 10000 + getBasicSalary();
	}
	
	public void displayManagerDetails() {
		System.out.println("DeptNumber: "+deptNumber);
		System.out.println("CalculatedSalary: "+CalculateSalary());
		
	}
}
