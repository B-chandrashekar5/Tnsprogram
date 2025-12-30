package com.tnsif.Demo.Day5;

public class ThisKey {
	int a=20;
	public void show() {
		int a=10;
		System.out.println("Local variable"+a);
		System.out.println("Instance variable"+this.a);
	}

}
