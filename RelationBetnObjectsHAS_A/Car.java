package RelationBetnObjectsHAS_A;

public class Car {
	private String color;
	private String brand;
	private double price;
	
	//Early instantiation
	private Engine e = new Engine(4, 2000);	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	public void DisplayDetails(String color, String brand, double price) {
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
	}
}
