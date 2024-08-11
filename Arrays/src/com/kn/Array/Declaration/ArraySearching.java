package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of array ");
		int[] arr  = new int[scan.nextInt()];
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("enter the" +(i+1)+"element");
			 arr[i] = scan.nextInt();
		}
			int num ;
			System.out.println("enter the number= ");
			num = scan.nextInt();
			Searnching(arr,num);
		
	}

	 static void Searnching(int[] arr, int num) {
		 int count = 0;
		 for(int i =0 ;i<arr.length;i++) {
			 if(arr[i] == num ) {
				 System.out.println("element found at"+(i+1)+"position");
				 count++;
			 }
		 }
		 if(count == 0) {
			 System.out.println("element not found");
		 }
	}

}
