package com.tnsif.Demo.Day7;

public interface Interfacedemo {
	void show();
	
}
class dog implements Interfacedemo{

	@Override
	public void show() {
		System.out.println("Dog barks");
		
	}
	
}
