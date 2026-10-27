package First_part_practice;

public class TypeCast {
	int c = 8;//global variable
		public static void main(String[] args) {
			//widening
			int a = 4;
			double d = (int)a;
			
			System.out.println(d);
			
			//Narrowing
			double d1 = 45.98;
			int i = (int)d1;
			
			System.out.println(i);
			
			int a2 = 129;
			byte b = (byte)a2;
			System.out.println(b);
			
			System.out.println(str);//global static variable
		}
		
		static String str = "Anish";
}
