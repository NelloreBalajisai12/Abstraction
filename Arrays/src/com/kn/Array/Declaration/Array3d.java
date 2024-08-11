package com.kn.Array.Declaration;

import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int[][][] arr = new int[2][3][4];
		for(int i =0;i<arr.length;i++ ) {
			System.out.println("enter the "+(i+1)+" number");
			for(int j = 0;j<arr[j].length;j++) {
				System.out.println("enter the "+(j+1)+" number");
				for(int k =0;k<arr[k].length;k++) {
			System.out.println("enter the "+(k+1)+" number");
			 arr[i][j][k]= scan.nextInt();
			}
			}
		}
		
	}

}
