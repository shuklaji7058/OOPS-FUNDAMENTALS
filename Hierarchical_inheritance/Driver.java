package Hierarchical_inheritance;

public class Driver {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(4,6);
		t1.CalculteArea();
		t1.displayDetails();
		
		Square s1 = new Square(4);
		s1.CalculateArea();
		s1.displayDetails();
		
		Circle c1 = new Circle(5);
		c1.CalculateArea();
		c1.displayDetails();
	}
		
}
