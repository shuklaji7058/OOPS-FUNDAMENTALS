package Employee_management_system;

public class Driver {

	public static void main(String[] args) {
			Manager m = new Manager();
			
			
			
			m.setEmpId(101);
			m.setEmpName("Anish");
			m.setBasicSalary(25000);
			m.setDeptNumber(10);
			
			System.out.println("=====Employee Details=====");
			m.displayEmployeeDetails();
			System.out.println("=====Manager Details=====");
			m.displayManagerDetails();
			
	}

}
