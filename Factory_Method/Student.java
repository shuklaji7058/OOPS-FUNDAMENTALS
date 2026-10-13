package Factory_Method;

public class Student {
	private int sId;
	private String name;
	private String course;
	private double fees_paid;
	private double total_marks;
	
	Student(){
		
	}
	
	Student(int sId, String name, String course, double fees_paid, double total_marks){
		super();
		this.sId=sId;
		this.name=name;
		this.course=course;
		this.fees_paid=fees_paid;
		this.total_marks=total_marks;
	}
	
	public static Student createStudent() {
		return new Student();
	}
	
	//sId getter & setter
	public int getsId() {
		return sId;
	}
	public Student setsId(int sId) {
		this.sId=sId;
		return this;
	}
	
	//name getter & setter
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name=name;
		return this;
	}
	
	//fees_paid getter & setter
	public double getFeesPaid() {
		return fees_paid;
	}
	public Student setFeesPaid(double fees_paid) {
		this.fees_paid=fees_paid;
		return this;
	}
	
	//course getter & setter
	public String getCourse() {
		return course;
	}
	public Student setCourse(String course) {
		this.course=course;
		return this;
	}
	
	//total_marks getter & setter
	public double getTotalMarks() {
		return total_marks;
	}
	public Student setTotal_marks(double total_marks) {
		this.total_marks=total_marks;
		return this;
	}
	
	public Student DisplayDetails() {
		System.out.println("SID: "+sId);
		System.out.println("NAME: "+name);
		System.out.println("COURSE: "+course);
		System.out.println("FEES PAID: "+fees_paid);
		System.out.println("TOTAL MARKS: "+total_marks);
		return this;
	}
}
