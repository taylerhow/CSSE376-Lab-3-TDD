package primeNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import primeFactors.PrimeFactors;
import static primeFactors.PrimeFactors.generate;

public class PrimeNumberGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int k = 2; k < i; k++) {
			if (PrimeFactors.generate(k).equals(Arrays.asList(k)))
				list.add(k);
		}

		return list;
	}
}
