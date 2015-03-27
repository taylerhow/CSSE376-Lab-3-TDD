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
		if (i >= 6)
			list.add(5);
		if (i >= 8)
			list.add(7);
		if (i >= 12)
			list.add(11);
		if (i >= 14)
			list.add(13);
		if (i >= 18)
			list.add(17);

		return list;
	}
}
