package RelationBetnObjectsHAS_A;

public class Address {
		private int pincode;
		private String Landmark;
		
		public Address(int pincode, String Landmark) {
			this.pincode = pincode;
			this.Landmark = Landmark;
		}
		
		public void DisplayDetails() {
			System.out.println("Landmark: "+Landmark);
			System.out.println("pincode: "+pincode);
		}

}

/*
 Execution  |    What happens?
 1			|	new Employee(...) creates an Employee object.
 2			|	Its constructor assigns 101, "Anish" and 300000.
 3			|	e1.getAddress() calls the getAddress() method.
 4			|	new Address(...) creates an Address object.
 5			|   return address returns the reference to the driver.
 6			|   a1 stores that reference.
 7			|   a1.DisplayDetails() displays the address information.
			


 */
