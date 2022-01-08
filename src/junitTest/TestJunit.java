package junitTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import junitClass.Testdemo;

public class TestJunit {
	
	Testdemo t=new Testdemo();

	@Test
	public void TestClass() {
		int result1=t.add(10, 20);
		assertEquals(result1, 30);
		
		int sum=t.addArray();
		assertEquals(sum, 100);
		
		int fact=t.factorial(4);
		assertEquals(fact, 24);
		assertNotEquals(fact, 60);
		
		String greet= t.greet("Adarsh");
		assertEquals(greet, "Hello Adarsh");
		
		assertNotNull(greet);
		assertNotSame(greet, "Hello Rahul");
	}
}
