package com.tnsif.Demo.Day9;

public class ThrowsDemo {

	public void show() {
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
