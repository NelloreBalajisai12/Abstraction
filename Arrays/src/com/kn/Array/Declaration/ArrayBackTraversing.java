package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayBackTraversing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size = ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		 for(int i = 0;i<size;i++) {
			 System.out.println("enter the "+(i+1)+"=");
			 arr[i] = scan.nextInt();		 }
		
	    for(int i = (size-1);i>=0;i--) {
	    	System.out.println(arr[i]);
	    }

}
}