package com.tnsif.Demo.Day16;

import java.util.Arrays;
import java.util.List;

public class streamApi {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,26,5,3,4);
		li.stream().
		filter(n->n%2==0).
		forEach(System.out::println);
		
		
		
		
	}

}