package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayEvenOrOddCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr  = new int[scan.nextInt()];
		for(int  i = 0;i<arr.length;i++) {
			System.out.println("enter the "+(i+1)+"element= ");
			arr[i] =scan.nextInt();
		}
		ArrayCount array = new ArrayCount();
		array.arraycount(arr);
	}

}
