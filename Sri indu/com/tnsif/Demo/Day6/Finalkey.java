package com.tnsif.Demo.Day6;

public final class Finalkey {          // Final class can not be inherited
	
	final int collegecode=101;   //final variable cannot be changed
	
	final void show() {         // Fianl method cannot be overriden
		
		System.out.println("college code:"+collegecode);
		System.out.println("welcome to sriindu college");
	}
	
}
/*class demo extends Finalkey{
public void show()
{

}
}*/