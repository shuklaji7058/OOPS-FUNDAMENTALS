package Factory_Method;

public class Product_Driver {
	public static void main(String[] args) {
		Product p1 = Product.createProduct().setPid(101).setName("Bat").setPrice(3000).DisplayDetails();
	}
}
