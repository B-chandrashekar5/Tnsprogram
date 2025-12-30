package com.tnsif.Demo.Day5;

public class Polymorphismdemo {
	// can be done by using method overloading and method overriding
	int Rno=109;
	String Name="chandu";
	float CGPA=7.9f;
	public void dhoni(int a) {
		System.out.println("R:"+Rno);
	}
	public void dhoni(String a,float b) {
		System.out.println("B:"+ Name );
	}
	public void dhoni(float b,String a) {
		System.out.println("C:"+CGPA);
		
	}

}
