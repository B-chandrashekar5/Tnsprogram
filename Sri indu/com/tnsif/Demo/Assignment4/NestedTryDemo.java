package com.tnsif.Demo.Assignment4;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started");
            int num1 = 10;
            int num2 = 0;

            try {
                System.out.println("Inner try block started");
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block caught ArithmeticException: " + e.getMessage());
            }

            System.out.println("Outer try block ended");
        } catch (Exception e) {
            System.out.println("Outer catch block caught exception: " + e.getMessage());
        }
    }
}
