package com.tnsif.Demo.Assignment5;

import java.util.stream.Stream;

public class SortStreamexample {

	public static void main(String[] args) {
		Stream.of(6,10,5,12,4,7,1,9)
		.filter(x->x%2==0)
		.sorted()
		.map(x->x*x)
		.forEach(System.out::println);
	}

}