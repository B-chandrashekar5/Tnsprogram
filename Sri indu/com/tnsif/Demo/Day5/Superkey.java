package com.tnsif.Demo.Day5;


public class Superkey {
	int a=10;
	Superkey(int a){
		System.out.println("This is a constructor");
	}
	public void show() {
		System.out.println("This is a demo method");
		
	}

}
class Superdemo extends Superkey {
Superdemo(){
	super(30); // calling parent class constructor
}
public void display() {
	System.out.println(super.a); // calling instance variable
     super.show(); // calling the parent class method
}
}