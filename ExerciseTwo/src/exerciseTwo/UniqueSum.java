package exerciseTwo;

import java.util.Scanner;

public class UniqueSum {
	
	public static void main(String args[]) {
		
		System.out.println("Enter Your First Number: ");
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			System.out.println("Enter Your Second Number: ");
			int b = sc.nextInt();
			System.out.println("Enter Your Third Number: ");
			int c = sc.nextInt();
			unique(a,b,c);
		};
		
			
		
	}
	
	public static void unique(int a, int b, int c){
	
		int d;
		
		//all the same
		if ((a == b) & (a == c) ) {
			d = 0;
			System.out.println(d);
		} 
		// b + c is the same print out a
		else if ((b == c) & (b != a)) {
			d = a;
			System.out.println(d);
		}
		
		// a + c is the same print out b
		else if((a == c) & (a != b )) {
			d = b;
			System.out.println(d);
		}
		
		// a + b is the same print out c 
		else if ((b == a) & (b != c)) {
			d = c ;
			System.out.println(d);
		} 
	
		//all different
		else if ((a != b) & (a != c)) {
			 d = a + b + c ;
			 System.out.println(d);
		}	
		
	}
	

}
