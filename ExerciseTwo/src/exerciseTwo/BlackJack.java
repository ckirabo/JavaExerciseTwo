package exerciseTwo;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter Your First Number: ");
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			System.out.println("Enter Your Second Number: ");
			int b = sc.nextInt();
			blackJack(a,b);
		};
	
		
	
	}
	
	public static void blackJack(int a , int b) {
		
		if((a != 0) & (b != 0)){

			if ((a > 21) & (b > 21)) {
				  System.out.println(0);
			}

			else if((a > 21) & (b <= 21)){
			   System.out.println(b);
				}

		
			else if((b > 21) & (a <= 21)){
			    System.out.println(a);
				}
			
			else if ((a > b) & (a <= 21)) {
				  System.out.println(a);
			}
			
			else if ((b > a) & (b <= 21)) {
				  System.out.println(b);
			}

		}
		
	}
}
	
