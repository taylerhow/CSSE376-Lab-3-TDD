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

	// Verifies that the PrimeFactors class correctly returns 3 for the prime
	// factors of 3
	@Test
	public void testThree() {
		assertEquals(list(3), generate(3));
	}

	// Verifies that the PrimeFactors class correctly returns 2, 2 for the prime
	// factors of 4
	@Test
	public void testFour() {
		assertEquals(list(2, 2), generate(4));
	}

	// THIS TEST PASSED AT THE POINT OF BEING WRITTEN
	// it's redundant, and thus unnecessary for TDD
	// Verifies that the PrimeFactors class correctly returns 2, 3 for the prime
	// factors of 6
	@Test
	public void testSix() {
		assertEquals(list(2, 3), generate(6));
	}

	// Verifies that the PrimeFactors class correctly returns 2, 2, 2 for the
	// prime factors of 8
	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), generate(8));
	}

	// Verifies that the PrimeFactors class correctly returns 3, 3 for the prime
	// factors of 9
	@Test
	public void testNine() {
		assertEquals(list(3, 3), generate(9));
	}

	// THIS TEST PASSED AT THE POINT OF BEING WRITTEN
	// it's redundant, and thus unnecessary for TDD
	// Verifies that the PrimeFactors class correctly returns 5, 7, 7, 1327 for
	// the prime factors of 325115
	@Test
	public void test325115() {
		assertEquals(list(5, 7, 7, 1327), generate(325115));
	}
}
