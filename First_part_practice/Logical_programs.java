package First_part_practice;

import java.util.Scanner;

public class Logical_programs {
	public static void main(String[] args) {
		//TO COUNT NUMBER
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number :");
//		int n = sc.nextInt();
//		
//		int count = 0;
//		while(n!=0) {
//			count++;
//			n=n/10;
//		}
//		System.out.println("Number count is: "+count);
//		sc.close();
//		
//		//TO ADD NUMBER
//		int s = 7;
//		int sum = 0;
//		while(s!=0) {
//			int rem=s%10;
//			sum=sum+rem;
//			s=s/10;
//		}
//		System.out.println(sum);
		
		//MULTIPLY DIGITS
		
//		int a = 1234;
//		int prod = 1;
//		while(a!=0) {//condition
//			int rem = a%10;
//			
//			prod=prod*rem;
//			
//			a=a/10;
//		}
//		System.out.println(prod);
		
		//REVERSE DIGITS
		
//		int a = 123456;
//		int rev=0;
//		while(a!=0) {
//			int rem=a%10;
//			
//			rev=rev*10+rem;
//			a=a/10;
//		}
//		System.out.println(rev);
		
		
		//CHECK PRIME
		int a = 29;
		int count = 0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}	
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
		
	}

		
	}

