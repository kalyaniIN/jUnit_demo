package com.example.jUnit_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

	@Test
	void testAdd () {
		var calculator = new Calculator();
		assertEquals(4, calculator.add(2, 2));
		assertEquals(-1, calculator.add(2, -3));
	}

	@Test
	public void testSubtract() {
		var calculator = new Calculator();
		assertEquals(1, calculator.subtract(4, 3));
		assertEquals(5, calculator.subtract(2, -3));
	}

	@Test
	public void testMultiply() {
		var calculator = new Calculator();
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(-6, calculator.multiply(2, -3));
	}

	@Test
	public void testDivide1() {
		var calculator = new Calculator();
		assertEquals(2.5, calculator.divide(5, 2), 0.01);
		assertEquals(Double.POSITIVE_INFINITY, calculator.divide(5, 0), 0.01);
	}
	@Test
	public void testDivide2() {
		var calculator = new Calculator();
		assertTrue(Double.isInfinite(calculator.divide(5, 0)));
		assertFalse(Double.isNaN(calculator.divide(5, 3)));
	}

	@Test
	public void testSquareRootOf1() {
		var calculator = new Calculator();
		assertEquals(2.0, calculator.squareRootOf(4), 0.01);
		assertEquals(Double.NaN, calculator.squareRootOf(-1), 0.01);
	}
	@Test
	public void testSquareRootOf2() {
		var calculator = new Calculator();
		assertTrue(Double.isNaN(calculator.squareRootOf(-1)));
	}

	@Test
	public void testGetArea() {
		var calculator = new Calculator();
		assertEquals(12.57, calculator.getArea(2), 0.01);
		assertEquals(Double.NaN, calculator.getArea(-2), 0.01);
	}

	@Test
	public void testGetCircumference1() {
		var calculator = new Calculator();
		assertEquals(12.57, calculator.getCircumference(2), 0.01);
		assertEquals(Double.NaN, calculator.getCircumference(-2), 0.01);
	}

	@Test
	public void testGetCircumference2() {
		var calculator = new Calculator();

		assertTrue(Double.isNaN(calculator.getCircumference(-2)));
		assertEquals(0.0, calculator.getCircumference(0), 0.01);
	}

}
