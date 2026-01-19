package com.tnsif.Demo.Day11;

public class Thread2 extends Thread{

	ThreadDemoClass obj;
	public Thread2(ThreadDemoClass obj) {
		this.obj=obj;

	}
	public void run() {
		for(int y =1;y<5;y++) {
			obj.receiver();
		}
	}

}