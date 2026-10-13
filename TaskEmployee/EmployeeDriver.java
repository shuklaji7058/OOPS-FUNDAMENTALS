package TaskEmployee;

public class EmployeeDriver {
		public static void main(String[] args) {
			Employee e1 = new Employee(101,"Anish",2000);
			Employee e2 = new Employee(102,"Ravi",3000);

			
			e1.EmpDetails();
			
			System.out.println("AnnualSalary: "+e1.AnnualSal(2000));
			
			System.out.println("=========2=========");
			e2.EmpDetails();
			System.out.println("AnnualSalary: "+e2.AnnualSal(2000));

		}
}
