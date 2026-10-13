package ObjectLoading_with_Inhritance;

public class Std extends Person{
	int  sid;
	
	public Std() {
		super();
		System.out.println("Std is created");
	}
	
	public Std(String name, int age, int sid) {
		super();
		this.sid = sid;
	}
	
	public void displayDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("sid: "+sid);
	}
}
