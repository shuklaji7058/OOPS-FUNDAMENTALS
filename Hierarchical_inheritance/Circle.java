package Hierarchical_inheritance;

public class Circle extends Shape{
		double radius;
		
		Circle(){
			super();
		}
		
		Circle(double radius){
			super();
			this.radius = radius;
		}
		
		public void CalculateArea(){
			area = Math.PI*radius*radius;
		}
		
		public void displayDetails() {
			System.out.println("===Circle===");
			System.out.println("Radius: "+radius);
			System.out.println("Area: " + area);
		}
}
