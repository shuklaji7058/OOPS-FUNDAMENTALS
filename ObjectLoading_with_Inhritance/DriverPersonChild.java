package ObjectLoading_with_Inhritance;

public class DriverPersonChild {
	public static void main(String[] args) {
		System.out.println("============================");

		Std student = new Std();
		System.out.println("============================");
		student.displayDetails();
		System.out.println("============================");

		
		Std student1 = new Std("Anish",22,220);
		student1.displayDetails();
	}
}
