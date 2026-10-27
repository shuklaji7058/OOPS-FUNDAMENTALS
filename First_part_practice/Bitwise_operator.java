package First_part_practice;

public class Bitwise_operator {
	public static void main(String[] args) {
		//EVEN OR ODD
		int a = 12;
//		if((a & 1)==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
		if(a%2==1) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		String str = 10<3 ? "yes" : "no";
		
		System.out.println(str);
		
		//returning
		System.out.println(m1(1,2));
		
		m2();
	}
	
	public static int m1(int a , int b) {
		return a + b;
	}
	
	public static void m2() {
		System.out.println("babu");
	}
}
