package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.println();
			for(int j=0;j<=arr.length-1;j++) {
		System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		int[][] brr = new int[3][3];
		for(int i = 0;i<=brr.length-1;i++) {
			for(int j=0;j<=brr.length-1;j++) {
				brr[i][j]=scan.nextInt();
			}
		}
		for(int i = 0;i<=brr.length-1;i++) {
			System.out.println();
			for(int j=0;j<=brr.length-1;j++) {
		System.out.print(brr[i][j]+" ");
			}
		}
		System.out.println();
		int[][] crr = new int[3][3];
		for(int i = 0;i<=crr.length-1;i++) {
			System.out.println();
			for(int j=0;j<=crr.length-1;j++) {
				crr[i][j] =0;
				for(int k=0;k<=crr.length-1;k++) {
					crr[i][j] =crr[i][j]+arr[i][k]*brr[k][j];
				}
			}
		}
		for(int i = 0;i<=crr.length-1;i++) {
			System.out.println();
			for(int j=0;j<=crr.length-1;j++) {
				System.out.print(crr[i][j]+" ");
			}
		}
	}

}
