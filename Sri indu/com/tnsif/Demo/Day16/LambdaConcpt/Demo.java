package com.tnsif.Demo.Day16.LambdaConcpt;

interface Test{
	boolean isEven(int x);
}

public class Demo {

	public static void main(String[] args) {
		Test t=(x)->x%2==0;
		System.out.println(t.isEven(15));
		System.out.println(t.isEven(10));
	}

}