package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeCheckTest {

	@Test
	void testDisplayName() {
		PrimeCheck prCh = new PrimeCheck();
		assertNotNull(prCh.displayName("Meitei"));
	}
	
	@Test
	void testIsPrimeTrue() {
		PrimeCheck prCh = new PrimeCheck();
		//assertNotNull(prCh.isPrime(inNum)("Meitei"));
		assertEquals(true, prCh.isPrime(2));
	}
	
	@Test
	void testIsPrimeFalse() {
		PrimeCheck prCh = new PrimeCheck();
		//assertNotNull(prCh.isPrime(inNum)("Meitei"));
		assertEquals(false, prCh.isPrime(4));
	}

}
