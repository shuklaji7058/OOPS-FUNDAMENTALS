package Hierarchical_inheritance;

public class Triangle extends Shape {
		double height;
		double base;
		
		
		Triangle(){
			super();
		}
		
		Triangle(double height, double base){
			super();
			this.base = base;
			this.height = height;
		}
		
		public void CalculteArea() {
			area = height*base / 2;
		}
		
		public void displayDetails() {
			System.out.println("===Triangle===");
			System.out.println("Height "+height);
			System.out.println("Base: "+base);
			System.out.println("Area: "+area);
		}
}
