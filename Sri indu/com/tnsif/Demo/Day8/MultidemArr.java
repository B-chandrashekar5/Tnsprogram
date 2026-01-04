package com.tnsif.Demo.Day8;

//STATIC REPRESENTATION
public class MultidemArr {

	public static void main(String[] args) {
		int[][] cn=new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				cn[i][j]=(int)(Math.random()*10);
				System.out.print(cn[i][j]+" ");
			}
			System.out.println();
		}

	}

}
