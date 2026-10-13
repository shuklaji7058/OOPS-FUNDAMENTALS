package Helper;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person(101,"Anish","9876543211");
		System.out.println("pid : "+ p1.pId);
		System.out.println("pid : "+ p1.name);
		System.out.println("phNo : "+ p1.getphNo());
		
		p1.setphNo("9867564322");
		System.out.println("Update phNo : " + p1.getphNo());
	}
}
