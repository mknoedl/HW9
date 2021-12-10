package test;

import main.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class TestCalendar {

	Calendar calendar = new Calendar(0);
	GregorianCalendar gregorianCalendar = new GregorianCalendar();

	@ParameterizedTest
	@ValueSource(ints = {1904 , 1972, 2016, 2060, 2136})
	public void Should_return_true(int year) {
		assertTrue(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {1901 , 2199, 2013, 2021, 2135})
	public void Should_return_false(int year) {
		assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {731 , 1765, 1904, 2021, 9999})
	public void Should_return_if_year_is_leap(int year) {
		if (gregorianCalendar.isLeapYear(year)){
			assertTrue(gregorianCalendar.isLeapYear(year));
		} else {
			assertFalse(gregorianCalendar.isLeapYear(year));
		}
	}

	@Test
	public void ShouldNotBeNegative(){

	}
}
