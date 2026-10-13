package RelationBetnObjectsHAS_A;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Anish",300000);
		//Employee object created; Address is not created yet.
		Address a1 = e1.getAddress();
		//The method starts executing.
		a1.DisplayDetails();
		System.out.println("========================");
		e1.DisplayDetails();
	}
}
/*

e1 → Employee
     ├── eId = 101
     ├── name = Anish
     ├── sal = 300000
     └── address ─────→ a1

a1 → Address
     ├── pincode = 411062
     └── landmark = Chikhali
 */