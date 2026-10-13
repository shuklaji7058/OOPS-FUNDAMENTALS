package RelationBetnObjectsHAS_A;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1.getColor());
		System.out.println(c1.getPrice());
		System.out.println(c1.getBrand());
		
		System.out.println("==================================");
		
		System.out.println(c1.getE().getHp());
		System.out.println(c1.getE().getPiston());
	}
}
