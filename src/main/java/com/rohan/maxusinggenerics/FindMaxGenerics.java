package com.rohan.maxusinggenerics;

public class FindMaxGenerics {
	
	/**
	 * UC 1 Given 3 Integers find the maximum
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Integer maxNumInt(Integer first, Integer second, Integer third) {
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		else if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else return third;
	}

	/**
	 * UC 2 Given 3 Floats find the maximum
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Float maxNumFloat(Float first, Float second, Float third) {
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		else if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else return third;
	}
}
