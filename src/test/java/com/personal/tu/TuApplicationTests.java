package com.personal.tu;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TuApplicationTests {
	// Test accents
	@Test
	void testStringUtils() {
		String result = StringUtils.vowels("î0àpopoù");
		Assert.assertEquals(result, "iaoou");
	}

	// Test empty string
	@Test
	void testStringUtilsEmpty() {
		String result = StringUtils.vowels("");
		Assert.assertEquals(result, "");
	}

	// Try uniqueVowels when reapet vowels in string input

	@Test
	void testStringUtilsUniq() {
		String result = StringUtils.uniqueVowels("î0àpopoù");
		Assert.assertEquals(result, "iaou");
	}

	// Try another way more readable to write the test

	// Try uniqueVowels when empty string input
	@Test
	public void testStringUtilsUniqEmpty() {
		String input = "";
		String expected = "";
		assertEquals(expected, StringUtils.uniqueVowels(input));
	}

	// Try uniqueVowels when special char string input
	@Test
	public void testStringUtilsUniqSpecialChar() {
		String input = "i&oop%:;ù";
		String expected = "iou";
		assertEquals(expected, StringUtils.uniqueVowels(input));
	}

	// Try uniqueVowels when special no vowels string input
	@Test
	public void testStringUtilsUniqNoVowels() {
		String input = "ljlhkjhk";
		String expected = "";
		assertEquals(expected, StringUtils.uniqueVowels(input));
	}
}
