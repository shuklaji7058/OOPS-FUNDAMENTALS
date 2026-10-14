package Employee_management_system;

public class Employee {
		private int empId;
		private String empName;
		private double basicSalary;
		
		public Employee() {
			super();
		}
		
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public double getBasicSalary() {
			return basicSalary;
		}
		
		public void setBasicSalary(double basicSalary) {
			if(basicSalary > 0) {
			this.basicSalary = basicSalary;
		     }
		}
		
		public void displayEmployeeDetails() {
			System.out.println("EmpId: "+empId);
			System.out.println("EmpName: "+empName);
			System.out.println("BasicSalary: "+basicSalary);
		}
		
		
		
		
}
