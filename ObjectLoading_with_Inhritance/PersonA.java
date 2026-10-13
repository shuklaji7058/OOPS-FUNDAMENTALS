package ObjectLoading_with_Inhritance;

public class PersonA {
	String name;
	int age;
	long mobNumber;
	
	PersonA(){
		System.out.println("Person is created");
	}
	
	PersonA(String name, int age, long mobNumber){
		super();
		this.name = name;
		this.age = age;
		this.mobNumber = mobNumber;
	}
}
