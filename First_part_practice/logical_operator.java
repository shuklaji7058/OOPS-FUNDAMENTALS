package First_part_practice;

public class logical_operator {
	public static void main(String[] args) {
		
	
		int age = 18;
		boolean has_license = true;
		
		if(!(age>=18) && has_license) {//not logical operator
			System.out.println("Can drive");
		}
		else {
			System.out.println("Age should be Greate than or equal to 18");
		}
		
}
}