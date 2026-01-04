package com.tnsif.Demo.Day8;

public class Jaggedarr {
	public static void main(String[] args) {
		int[][] jaggedarr = new int[4][];
		jaggedarr[0]=new int[2];
		jaggedarr[1]=new int[3];
		jaggedarr[2]=new int[4];
		jaggedarr[3]=new int[5];
		
		int[][] jagged = {{1,2},{3,4,5},{6,7,8,9},{10,11,12,13,14}};
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
