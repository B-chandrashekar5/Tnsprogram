package com.tnsif.Demo.Day11;

public class ThreadMain {
    
	public static void main(String[] args) {
		ThreadDemoClass obj = new ThreadDemoClass();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}

}