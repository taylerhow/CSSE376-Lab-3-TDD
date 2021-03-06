package primeNumberGenerator;

import static org.junit.Assert.assertEquals;
import static primeNumberGenerator.PrimeNumberGenerator.generate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private Integer inputNumber;
	private List<Integer> expectedResult;

	private static List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public PrimeNumberGeneratorTest(Integer inputNumber,
			List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

   @Parameterized.Parameters
   public static Collection numbersToTest() {
      return Arrays.asList(new Object[][] {
         { 1, list()},
         { 3, list(2)},
         { 4, list(2,3)},
         { 6, list(2,3,5)},
         { 8, list(2,3,5,7)},
         { 12, list(2,3,5,7,11)},
         { 14, list(2,3,5,7,11,13)},
         { 18, list(2,3,5,7,11,13,17)},
         { 20, list(2,3,5,7,11,13,17,19)}
      });
   }

	@Test
	public void testPrimeNumberGenerator() {
		assertEquals(expectedResult, generate(inputNumber));
	}
}