package non_static_method;

public class InitializerDriver {
		public static void main(String[] args) {
//		System.out.println("Hello");
//	
//	{
//		int a=10;
//		int b=20;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a+b);
//	}
//	
//	public static void main(String[] args) {
//		InitializerDriver d = new InitializerDriver();
//	}
			Employee e1 = new Employee(101);
			e1.PrintDetails();
	
		}
}
