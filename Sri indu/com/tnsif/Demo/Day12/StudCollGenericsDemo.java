package com.tnsif.Demo.Day12;

import java.util.ArrayList;

public class StudCollGenericsDemo {

	public static void main(String[] args) {
		ArrayList<Student> ob = new ArrayList<Student>();
		Student st = new Student(101, "anjan", 100.0);
		ob.add(st);
		Student st1 = new Student(102, "ganesh", 99.0);
		ob.add(st1);
		//System.out.print(ob+"n/");
		System.out.println("before sorting");
		System.out.println(ob);
		System.out.println("after sorting");
		System.out.println(ob);
		
		
	}

}