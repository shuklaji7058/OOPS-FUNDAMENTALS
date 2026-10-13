package Factory_Method;

public class Product {
		private int pid;
		private String name;
		private double price;
		
		
		public Product() {
			
		}
		
		public Product(int pid, String name, double price) {
			super();
			this.pid=pid;
			this.name=name;
			this.price=price;
		}
		
		public static Product createProduct() {
			return new Product();
		}
		
		public int getPid() {
			return pid;
		}
		
		public Product setPid(int pid) {
			this.pid=pid;
			return this;
		}
		
		public String getName() {
			return name;
		}
		
		public Product setName(String name) {
			this.name=name;
			return this;
		}
		
		public double getPrice() {
			return price;
		}
		
		public Product setPrice(double price) {
			this.price=price;
			return this;
		}
		
		public Product DisplayDetails() {
			System.out.println("PID: "+pid);
			System.out.println("Name: "+name);
			System.out.println("Price: "+price);
			return this;
		}
}
