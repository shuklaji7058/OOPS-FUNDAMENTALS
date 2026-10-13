package ObjectLoading_with_Inhritance;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("Person is created");
	}
	
	public Person(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
}
