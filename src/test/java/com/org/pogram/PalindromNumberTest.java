package com.org.pogram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromNumberTest {
	PalindromNumber palindromNumber = null;
	
	@Before
	public void setup(){
		palindromNumber = new PalindromNumber();
	}

	@Test
	public void whenNonPalindromWordIsPassed_thenResultIsFalse() {
		boolean result = palindromNumber.isPalindrom("BASU");
		assertFalse(result);
	}
	
	@Test
	public void whenPalindromWordIsPassed_thenResultIsTrue() {
		boolean result = palindromNumber.isPalindrom("MADAM");
		assertTrue(result);
	}

	
	@Test
	public void whenWordwithAllCharsAsSame_thenResultIsTrue() {
		boolean result = palindromNumber.isPalindrom("SSSS");
		assertTrue(result);
	}
	
	@Test
	public void whenEvenWordLengthIsPassed_thenResultIsTrue() {
		boolean result = palindromNumber.isPalindrom("SUUS");
		assertTrue(result);
	}
	
	@Test
	public void whenNullIsPassed_thenResultIsFalse() {
		
		boolean result = palindromNumber.isPalindrom(null);
		assertFalse(result);
		
	}

}
