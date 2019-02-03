package com.in28Minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void test() {
		
		MyMath m = new MyMath();
		assertEquals(6,m.sum(new int[] { 1, 2, 3 }));
		
	}

}
