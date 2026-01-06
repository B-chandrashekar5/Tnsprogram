package com.tnsif.Demo.Day9;


//FOR A SINGLE TRY BLOCK MULTIPLE CATCH BLOCKS CAN BE CREATED  


public class MultiCatch {
	public void show() {
		try {
			int a,b;
			a=10;
			b=0;
			int c=a/b;
			System.out.println("Division"+c);
			int[] arr= {1,2,3,4};
			System.out.println(arr[1]);
			System.out.println(arr[4]);
			String s=null;
			System.out.println(s.length());
		}
			catch(ArithmeticException e) {
				System.out.println("The division is not possible");
				
			}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("you cannot read the value of arr[4]");
			
		}
		catch(NullPointerException d) {
			System.out.println("The String value is Null");
		}
		}
	}


