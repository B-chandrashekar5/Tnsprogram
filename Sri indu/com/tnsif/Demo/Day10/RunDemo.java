package com.tnsif.Demo.Day10;

public class RunDemo{

	public static void main(String [] args){

		RunThread rt = new RunThread();
		Thread t1 = new Thread(rt);
		t1.start();
	}
}