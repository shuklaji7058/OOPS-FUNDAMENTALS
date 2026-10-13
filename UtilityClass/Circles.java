package UtilityClass;


//Performs operations/calculations on a circle.
public class Circles {
	public static double getDiameter(Circle c) {
		return 2*c.getRadius(); //Diameter = 2 × radius
	}
	
	public static double getArea(Circle c) {
		return Math.PI*c.getRadius()*c.getRadius();//Area = π × r × r
	}
	
	public static double getCircum(Circle c) {
		return 2*Math.PI*c.getRadius();//Circumference = 2 × π × r
		
	}
}
