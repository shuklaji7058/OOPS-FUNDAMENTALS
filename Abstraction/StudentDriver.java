package Abstraction;

public class StudentDriver {
	public static void main(String[] args) {
		StudentImp std = new StudentImp();
		std.attendclass();
		std.bunk();
		
		
		//Upcasting
		System.out.println("=================================");
		

		Student std1 = new StudentImp();
		std1.attendclass();
		std1.bunk();
	}
}
