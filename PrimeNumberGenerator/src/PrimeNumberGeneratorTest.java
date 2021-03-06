import static org.junit.Assert.assertEquals;
import PrimeNumberGenerator.generate;

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
   public PrimeNumberGeneratorTest(Integer inputNumber, List<Integer> expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection numbersToTest() {
      return Arrays.asList(new Object[][] {
         { 1, list() }
      });
   }

   @Test
   public void testPrimeNumberGenerator() {
      assertEquals(expectedResult, generate(inputNumber));
   }
}