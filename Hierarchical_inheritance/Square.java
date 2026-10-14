package Hierarchical_inheritance;

public class Square extends Shape{
		double side;
		
		Square(){
			super();
		}
		
		Square(double side){
			super();
			this.side = side;
		}
		
		public void CalculateArea() {
			area = side*side;
		}
		
		public void displayDetails() {
			System.out.println("===Square===");
			System.out.println("Side: "+side);
			System.out.println("Area: " + super.area);
		}
}
