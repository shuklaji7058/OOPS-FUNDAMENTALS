package ObjectLoading_with_Inhritance;

public class Employee extends PersonA{
	int empId;
	double salary;
	
	public Employee(){
		super();
		System.out.println("Employee created");
	}
	
	public Employee(String name, int age, long mobNumber,int empId, double salary){
		super(name, age, mobNumber);
		this.empId = empId;
		this.salary = salary;
	}
	

	public void displayDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("mobNumber: "+mobNumber);
		System.out.println("empId: "+empId);
		System.out.println("salary: "+salary);
	}
}
