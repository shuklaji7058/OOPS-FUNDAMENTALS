package ObjectLoading_with_Inhritance;

public class DriverAssignment {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
//									OUTPUT:- 
									//Person is created
									//Employee created
		System.out.println("==========================");
		e1.displayDetails();name:  //OUTPUT-
								   //null
								   //age: 0
								  //mobNumber: 0
								  //empId: 0
							      //salary: 0.0
		
		System.out.println("==========================");

		Employee e2 = new Employee("Anish",22,7058601500L,101,25000);

		e2.displayDetails();
		
		//OUTPUT
//		name: Anish
//		age: 22
//		mobNumber: 7058601500
//		empId: 101
//		salary: 25000.0
	}
}
