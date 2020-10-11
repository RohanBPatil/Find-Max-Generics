package com.rohan.maxusinggenerics;

public class FindMaxGenerics {

	/**
	 * UC 3 refactoring to use generic method
	 * @param <E>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public <E extends Comparable<E>> E findMax(E first, E second, E third) {
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else
			return third;
	}
}
