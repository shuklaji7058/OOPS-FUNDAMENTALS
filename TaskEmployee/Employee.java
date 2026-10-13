package TaskEmployee;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("Employee Details");
	}
	
	public Employee(int employeeId, String name, double salary) {
		this();
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	
	public double AnnualSal(double salary) {
		return salary*12;
	}
	
	//Getter
	public double getSalary() {
		return salary;
	}

	public int getEmployeeId(){
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	//Setter
	public void setSalary(double salary) {
		if(salary>0) 
		{
		this.salary=salary;
		}
		else
		{
			System.out.println("insufficient amount");
		}
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	//Display
	public void EmpDetails() {
		System.out.println("Name: "+name);
		System.out.println("EmployeeId: "+ employeeId);
		System.out.println("Salary: "+salary);
	}
}
