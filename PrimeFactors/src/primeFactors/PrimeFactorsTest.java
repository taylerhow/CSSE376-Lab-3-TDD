package primeFactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
	
	private List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}

	//Verifies that the PrimeFactors class correctly returns an empty list for the prime factors of 1
	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	//Verifies that the PrimeFactors class correctly returns 2 for the prime factors of 2
		@Test
		public void testTwo() {
			assertEquals(list(2), PrimeFactors.generate(2));
		}
}
