package ASSIGNMENT_BOX;

public class Box {
	
	double length;
	double width;
	Box(){
		System.out.println("Box Properties");
	}
	
	Box(double length){
		this();
		this.length=length;
	}
	
	Box(double length, double width){
		this(length);
		this.width=width;
	}
	
	double getArea(){
		return length*width;
	}
	
}
