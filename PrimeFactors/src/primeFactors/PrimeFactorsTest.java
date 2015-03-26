package primeFactors;

import static org.junit.Assert.*;
import static primeFactors.PrimeFactors.generate;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	// Verifies that the PrimeFactors class correctly returns an empty list for
	// the prime factors of 1
	@Test
	public void testOne() {
		assertEquals(list(), generate(1));
	}

	// Verifies that the PrimeFactors class correctly returns 2 for the prime
	// factors of 2
	@Test
	public void testTwo() {
		assertEquals(list(2), generate(2));
	}

	// Verifies that the PrimeFactors class correctly returns 2 for the prime
	// factors of 2
	@Test
	public void testThree() {
		assertEquals(list(3), generate(3));
	}
}
