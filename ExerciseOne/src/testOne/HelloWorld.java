package testOne;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello World!";
		
		

     	System.out.println("Hello World!");
		
		System.out.println(a);
		
		helloWorld(a);

		System.out.println(returnHelloWorld(a));
		System.out.println(add(1,2));
	
		
	}

	public static void helloWorld(String a) {
		System.out.println(a);	
	}
	
	public static String returnHelloWorld(String a) {
		return a;
	}
	
	public static int add(int a, int b) {	
	int c; 
	c = a + b;
	return c;
	}
	
	
}
