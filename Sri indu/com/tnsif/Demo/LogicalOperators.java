package com.tnsif.Demo;

public class LogicalOperators {

	public static void main(String[] args) {
		// Using int data type
        int a = 10, b = 20;
        System.out.println("Using int:");
        System.out.println((a > 5) && (b > 15));   // true
        System.out.println((a > 15) || (b > 15));  // true
        System.out.println(!(a > b));              // true

        // Using float data type
        float x = 5.5f, y = 3.2f;
        System.out.println("\nUsing float:");
        System.out.println((x > y) && (y < 5.0));  // true
        System.out.println((x < y) || (y > 2.0));  // true
        System.out.println(!(x == y));             // true

	}

}
