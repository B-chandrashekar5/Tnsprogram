package com.tnsif.Demo.Day9;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		//EXAMPLE1 (ARIHMETIC EXCEPTION)
		try {
			int a,b;
			a=10;
			b=0;
			int c=a/b;
			System.out.println("Division"+c);
			
			
		}
        catch(Exception e){
        	System.out.println("The division is not possible");
        }
		
		
		//EXAMPLE2 (INDEX OUT OF BOUND EXCEPTION)
		try {
			int[] arr= {1,2,3,4};
			System.out.println(arr[1]);
			System.out.println(arr[4]);
			
		}
		catch(Exception e1){
			System.out.println("you cannot read the value of arr[4]");
			
			
		}
		
		//EXAMPLE3 (NULL POINTER EXCEPTION)
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(Exception e2) {
			System.out.println("The String value is Null");
			
		}
	}

}
