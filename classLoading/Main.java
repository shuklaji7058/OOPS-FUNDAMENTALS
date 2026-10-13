package classLoading;

public class Main {
		static int a = test();
		static int b = 20;//3
		
		public static int test() {
			System.out.println("a from test(): " + a);//1  //5
			System.out.println("b from test(): " + b);//2  //6
			return 10;
		}
		
		public static void main(String[] args) {
			System.out.println("Main start");//4
			test();
			System.out.println("Main end");//7
		}
		
		static {
			System.out.println(b);
			b=40;
		}
}
