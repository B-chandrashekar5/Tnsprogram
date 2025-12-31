package com.tnsif.Demo.Assignment2;
import java.util.Scanner;
public class Multiplicationmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int number=sc.nextInt();
		Multiplicationtable mt=new Multiplicationtable();
		mt.table(number);
		

	}

}
