package com.tnsif.Demo.Day12;

import java.util.ArrayList;

public class ArrayCollectionDemo {

	public static void main(String[] args) {
		ArrayList<Student> ob = new ArrayList<Student>();
		Student st = new Student(101, "chandu", 100.0);
		ob.add(st);
		Student st1 = new Student(102, "ganesh", 99.0);
		ob.add(st1);
		System.out.print(ob+"n/");
		
		
	}

}