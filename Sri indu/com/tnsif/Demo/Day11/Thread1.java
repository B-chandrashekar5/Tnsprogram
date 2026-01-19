package com.tnsif.Demo.Day11;

public class Thread1 extends Thread{

	ThreadDemoClass obj;
	public Thread1(ThreadDemoClass obj) {
		this.obj=obj;
		
	}
	public void run() {
		for(int x =1;x<5;x++) {
			obj.deliver(x);;
		}
	}
	
}