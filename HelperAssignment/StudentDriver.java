package HelperAssignment;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student(01,"Anish",78,"Testing",true);
		Student s2=new Student(02,"Ravi",88,"Finance",true);
		Student s3=new Student(03,"Aarush",98,"Development",true);
		
		System.out.println("======1======");
		
		s1.DisplayDetails();
		System.out.println(s1.getFeesPaid());
		s1.setTotalMarks(99);
		System.out.println("Update Total Marks: "+s1.getTotalMarks());
		
		System.out.println("======2======");
		
		
		s2.DisplayDetails();
		System.out.println(s2.getFeesPaid());
		s2.setTotalMarks(90);
		System.out.println("Update Total Marks: "+s2.getTotalMarks());
		
		System.out.println("======3======");
		
		s3.DisplayDetails();
		System.out.println(s3.getFeesPaid());
		s3.setTotalMarks(100);
		System.out.println("Update Total Marks: "+s3.getTotalMarks());
	}
}
