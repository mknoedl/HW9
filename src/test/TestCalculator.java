package test;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(2, calculator.add(1,1));
	}


	@ParameterizedTest
	@CsvSource({
			"1, 1",
			"2, 3",
			"4, 7",
	})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(valueOne+valueTwo, calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(0, calculator.sub(3,3));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(6, calculator.multiply(2,3));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(6, calculator.divide(36,6));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertEquals("ZeroDivisionError", calculator.divide(4,0));
	}
}
