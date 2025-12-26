package com.tnsif.Demo.Day4;

public class Overload {
	int sid=109;
	String sname="chandu";
	Overload()
	{
		System.out.println("The student name is:"+sname);
		System.out.println("The student id is:"+sid);
	}
	Overload(int a){
		System.out.println("The student id is:"+sid+"The value of a is:"+a);
	 
	}
	Overload(int a,String b){
		System.out.println("The value is:"+a+"The value is:"+b);
	}

}
