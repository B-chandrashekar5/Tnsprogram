package com.tnsif.Demo.Day8;


//static representation
public class Singlearr {

	public static void main(String[] args) {
		int[] arr= new int [5];
		arr[0]=9;
		arr[1]=8;
		arr[2]=7;
		arr[3]=6;
		arr[4]=5;
		
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]);
		}
		
		// other representation (syntax)
		
		System.out.println("Another Example");
		int[] arr2= {1,2,3,4};
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			
		}
		
		
	}

}
