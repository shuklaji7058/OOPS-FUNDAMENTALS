package CoreJava;

public class OverloadingDriver {
		public static void main(String[] args) {
			Student s1 = new Student();
			Student s2 = new Student(100);
			Student s3 = new Student("Ravi");
			Student s4 = new Student(101,"Anish",99);
			
			System.out.println(s1.sid);
			System.out.println(s1.name);
			System.out.println(s1.marks);
			System.out.println("==============");
			
			System.out.println(s2.sid);
			System.out.println(s2.name);
			System.out.println(s2.marks);
			System.out.println("==============");
			
			System.out.println(s3.sid);
			System.out.println(s3.name);
			System.out.println(s3.marks);
			System.out.println("==============");
			
			System.out.println(s4.sid);
			System.out.println(s4.name);
			System.out.println(s4.marks);
			System.out.println("==============");
		}
}
