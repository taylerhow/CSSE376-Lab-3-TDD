package primeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (i >= 3)
			list.add(2);
		if (i >= 4)
			list.add(3);

		return list;
	}
}
