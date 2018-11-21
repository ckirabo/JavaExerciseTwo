package exerciseTwo;



public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5; 
		int b = 22;
		
		blackJack(21,21);
		
	}
	
	public static void blackJack(int a , int b) {
		
	// if a is greater than b and over 21 ???

		while((a != 0) & (b != 0)){

			if ((a > 21)) {
                 a = 0;
			}

			if (b > 21){
				 b = 0;
			}

		
		    if((a > b) & (a <= 21)){
			   System.out.println(a);
				}

		
			if((b > a) & (b <= 21)){
			    System.out.println(b);
				}


			break;

		}
	}
}
	
