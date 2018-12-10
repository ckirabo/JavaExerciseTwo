package conditionals;

import java.util.Random;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditionals

		Boolean y = true;
		
		Integer[] numbers = {0,1,2,3,4,5,6,7,8,9}; 
	    
		//conditionals
	    System.out.println(addConditional(6,6,y));
		
	    //iteration
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(checkConditional(8,0,!y));
		}
		
		//arrays
		arrayNumbers(numbers);
		
		
		//iteration arrays 1 + 2
		for(int i = 0; i< numbers.length; i++ ) {
		    System.out.println(numbers[i]);
		}
		
		for(int j = 0; j < numbers.length ; j++) {
			 numbers[j] = j *10;
			 System.out.println(numbers[j]);
			}
	}
	


	public static int addConditional(int a, int b, boolean c) {
		
		int d;
		
		if (c) {
			d = a + b;
		}
		else {
			d = a * b;
		}
		return d;
	}
	
	public static int checkConditional(int a, int b , boolean c) {
		
        int d;
        
    	if(a == 0 & b != 0 ){
    		d = b;
    		return d;
    		}
       else if(a != 0 & b == 0) {
    		d = a;	
    		return d;
    		}
       

    	
		if (c) {
			d = a + b;
		}
		else {
			d = a * b;
		}
	
		return d;
		
	
	}


	public static void arrayNumbers(Integer[] array) {
		
		int e = new Random().nextInt(array.length);
		int f = new Random().nextInt(array.length);
		
		
		System.out.println(checkConditional(e,f,!true));
	}

	

}
