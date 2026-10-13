package Helper;

public class Person {
	int pId;
	String name;
	private String phNo;
	
	public Person() {
		
	}
	
	public Person(int pId, String name, String phNo) {
		this.pId=pId;
		this.name=name;
		this.phNo=phNo;
	}
	
	//Getter method
	public String getphNo() {
		return phNo;
	}
	
	//Setter Method
	public void setphNo(String phNo) {
		this.phNo=phNo;
	}
}
