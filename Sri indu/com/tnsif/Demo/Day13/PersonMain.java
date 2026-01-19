package com.tnsif.Demo.Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List <Person>ob = new ArrayList<Person>();
		Person p = new Person("bharath", "hyd");
		ob.add(p);
		Person p1 = new Person("suresh", "delhi");
		ob.add(p1);
		Person p2 = new Person("ramesh", "banglore");
		ob.add(p2);
		System.out.println(ob);
		System.out.println("sorting names");
		Collections.sort(ob,new sortNyName());
		System.out.println(ob);
		System.out.println("sorting city");
		Collections.sort(ob,new sortNyCity());
		System.out.println(ob);

	}

}