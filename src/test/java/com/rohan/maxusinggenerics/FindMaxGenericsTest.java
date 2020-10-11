package com.rohan.maxusinggenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FindMaxGenericsTest {
	public static FindMaxGenerics findMaxGenerics;

	@BeforeAll
	public static void initiate() {
		findMaxGenerics = new FindMaxGenerics();
	}

	@Test
	public void givenFirstMaxInt_shouldReturn_first() {
		Integer first = 9;
		Integer second = 5;
		Integer third = 7;
		assertEquals(first, findMaxGenerics.maxNumInt(first, second, third));
	}

	@Test
	public void givenSecondMaxInt_shouldReturn_second() {
		Integer first = 9;
		Integer second = 10;
		Integer third = 7;
		assertEquals(second, findMaxGenerics.maxNumInt(first, second, third));
	}

	@Test
	public void givenThirdMaxInt_shouldReturn_third() {
		Integer first = 9;
		Integer second = 5;
		Integer third = 10;
		assertEquals(third, findMaxGenerics.maxNumInt(first, second, third));
	}

	@Test
	public void givenFirstMaxFloat_shouldReturn_first() {
		Float first = 9.5f;
		Float second = 5.4f;
		Float third = 7.1f;
		assertEquals(first, findMaxGenerics.maxNumFloat(first, second, third));
	}

	@Test
	public void givenSecondMaxFloat_shouldReturn_second() {
		Float first = 9.5f;
		Float second = 10.4f;
		Float third = 7.1f;
		assertEquals(second, findMaxGenerics.maxNumFloat(first, second, third));
	}

	@Test
	public void givenThirdMaxFloat_shouldReturn_third() {
		Float first = 9.5f;
		Float second = 5.4f;
		Float third = 10.3f;
		assertEquals(third, findMaxGenerics.maxNumFloat(first, second, third));
	}

	@Test
	public void givenFirstMaxString_shouldReturn_first() {
		String first = "peach";
		String second = "banana";
		String third = "apple";
		assertEquals(first, findMaxGenerics.maxNumString(first, second, third));
	}

	@Test
	public void givenSecondMaxString_shouldReturn_second() {
		String first = "banana";
		String second = "peach";
		String third = "apple";
		assertEquals(second, findMaxGenerics.maxNumString(first, second, third));
	}

	@Test
	public void givenThirdMaxString_shouldReturn_third() {
		String first = "banana";
		String second = "apple";
		String third = "peach";
		assertEquals(third, findMaxGenerics.maxNumString(first, second, third));
	}
}
