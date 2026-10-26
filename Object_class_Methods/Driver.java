package Object_class_Methods;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"Anish",77.80);
		Student s2 = new Student(101,"Anish",77.80);

		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		  // Calling toString() method
        System.out.println(s1.toString());
        System.out.println(s2.toString());
	}

}
