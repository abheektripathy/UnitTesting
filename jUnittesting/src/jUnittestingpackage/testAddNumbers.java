package jUnittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction juint = new jUnitFunction();
		int result = juint.addNumbers(100, 300);
		
		assertEquals (400,result);
	}

}
