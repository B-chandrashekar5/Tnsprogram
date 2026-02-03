package com.tnsif.Demo.Day16.LambdaConcpt;

import java.util.function.Predicate;

public class predicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven=x->x%2==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(15));
	}

}