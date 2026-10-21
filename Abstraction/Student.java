package Abstraction;

public abstract class Student {
	int sid;
	String name;
	
	public Student() {
		
	}
	
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	//Concrete Method
	public void attendclass() {
		System.out.println("White collar Job");
	}
	
//	abstract Method
	public abstract void bunk();
	
}
