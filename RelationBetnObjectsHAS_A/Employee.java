package RelationBetnObjectsHAS_A;

public class Employee {
		private int eId;
		private String name;
		private double sal;
		
		private Address address;
		
		public Employee() {
			
		}
		
		public Employee(int eId, String name, double sal) {
			this.eId = eId;
			this.name = name;
			this.sal = sal;
		}
		
		public void setAddress(Address address) {
			this.address = address;
		}
		
		//Lazy instantiation
		public Address getAddress() {
			address = new Address(411062,"Chikhali");
					//This is where the dependent object is instantiated
			return address;
			//The reference is assigned to a1.
		}
		/*
		The actual creation happens at new Address(...), 
		when getAddress() executes. 
		Defining the method alone does not create the object.		
		----------------------------------------------------
 		1)new Address(411062, "Chikhali") creates the Address object.

		2)address = stores its reference in the address instance variable
           of the Employee object.

		3)return address; sends that reference back to the calling code.
*/
		
		public int getEid() {
			return eId;
		}
		
		public Employee setEid(int eId) {
			this.eId = eId;
			return this;
		}
		
		
		
		public void DisplayDetails() {
			System.out.println("eId: "+eId);
			System.out.println("name: "+name);
			System.out.println("sal: "+sal);
		}
		
	
}
/*
 * Employee
 ├── eId
 ├── name
 ├── sal
 └── address  ─────→ Address object
                       ├── pincode
                       └── landmark
*/
