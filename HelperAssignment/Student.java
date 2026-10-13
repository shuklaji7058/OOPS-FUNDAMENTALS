package HelperAssignment;

public class Student {
	int stdId;
	String name;
	private int total_marks;
	String course;
	private boolean fees_paid;


	public Student(){
		
	}
	
	public Student(int stdId, String name, int total_marks, String course, boolean fees_paid) {
		this.stdId=stdId;
		this.name=name;
		this.total_marks=total_marks;
		this.course=course;
		this.fees_paid=fees_paid;
	}
	
	//Getter
	public int getTotalMarks() {
		return total_marks;
	}
	
	public boolean getFeesPaid() {
		return fees_paid;
	}
	
	//Setter
	
	public void setTotalMarks(int total_marks) {
		this.total_marks=total_marks;
	}
	
	public void setFeesPaid(boolean fees_paid) {
		this.fees_paid=fees_paid;
	}
	
	public void DisplayDetails() {
		System.out.println("stdId: "+stdId);
		System.out.println("name: "+name);
		System.out.println("total_marks: "+total_marks);
		System.out.println("Course: "+course);
		System.out.println("fees_paid: "+fees_paid);
	}
	}
