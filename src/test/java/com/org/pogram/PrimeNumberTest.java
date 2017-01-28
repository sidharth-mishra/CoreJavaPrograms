package com.org.pogram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {
	PrimeNumber pm=null;
	@Before
	public void setUp(){
	   pm=new PrimeNumber();

	}

	@Test
	public void whenAnEvenNumberIsPassed_thenResultisNotPrime() {
	boolean result=	pm.isPrimeNumber(4);
	assertFalse(result);
	}
	
	@Test
	public void whenOneIsPassed_thenResultisNotPrime() {
	boolean result=	pm.isPrimeNumber(1);
	assertFalse(result);
	}

	@Test
	public void whentwoIsPassed_thenResultisPrime() {
	boolean result=	pm.isPrimeNumber(2);
	assertTrue(result);
	}

	@Test
	public void whenPrimenumberIsPassed_thenResultisPrime() {
	boolean result=	pm.isPrimeNumber(7);
	assertTrue(result);
	}
	
	@Test
	public void whenAnOddDivisibleNumberIsPassed_thenResultisNotPrime() {
	boolean result=	pm.isPrimeNumber(27);
	assertFalse(result);
	}
	
	@Test
	public void whenZeroIsPassed_thenResultisNotPrime() {
	boolean result=	pm.isPrimeNumber(0);
	assertFalse(result);
	}

}
