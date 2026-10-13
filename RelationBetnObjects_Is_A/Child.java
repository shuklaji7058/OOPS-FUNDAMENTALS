package RelationBetnObjects_Is_A;

public class Child extends Parent{
	//Example-1
//	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		p1.m1();
//		System.out.println(p1.a);
//	}
//	
	public static void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
		public static void main(String[] args) {
			Parent p1 = new Parent();
			System.out.println(p1.a);
			
			m3();
		}
	
	
	
}
