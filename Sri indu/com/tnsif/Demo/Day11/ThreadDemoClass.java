package com.tnsif.Demo.Day11;

public class ThreadDemoClass{
	
	int i;
	boolean flag=false;

	synchronized void deliver(int i)
	{
		// wait while there's already an unconsumed message
		while(flag){
			try{
				wait();
			}catch(Exception e){
				System.err.println(e);
			}
		}
		this.i = i;           // <-- fixed: store the passed-in value
		flag = true;
		System.out.println("The msg is delivered "+i);
		notify();
	}

	synchronized int receiver()
	{
		// wait while there's no message to consume
		while(!flag){
			try{
				wait();
			}catch(Exception e){
				System.err.println(e);
			}
		}
		System.out.println("The msg is received "+i);
		flag = false;
		notify();
		return i;
	}
}