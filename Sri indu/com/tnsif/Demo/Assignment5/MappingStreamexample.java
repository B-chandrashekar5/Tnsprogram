package com.tnsif.Demo.Assignment5;

import java.util.Arrays;

public class MappingStreamexample {

	public static void main(String[] args) {
		String[] arr= {"java","python","spring","hibernate"};
		Arrays.stream(arr)
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}

}