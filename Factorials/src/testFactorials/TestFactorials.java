package testFactorials;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import factorials.Factorials;

public class TestFactorials {

	@Test
	public void testDivideB() {
		Factorials f = new Factorials();
		int a = 120;
		int b;
		assertEquals("Value is not 60", 60, b = a/2);
	}
	
	@Test
	public void testDivideC() {
		Factorials f = new Factorials();
		int b = 60;
		int c;
		assertEquals("Value is not 20", 20, c = b/3);
	}
	
	@Test
	public void testDivideD() {
		Factorials f = new Factorials();
		int c = 20;
		int d;
		assertEquals("Value is not 5", 5, d = c/4);
	}
	
	@Test
	public void testDivideE() {
		Factorials f = new Factorials();
		int d = 5;
		int e;
		assertEquals("Value is not 1", 1, e = d/5);
	}
	@Test
	public void testIsFactorial() {
		Factorials f = new Factorials();
		//assertTrue("Value is n", f.isAFactorial(x));
		fail("Method failed test");

	}
}
