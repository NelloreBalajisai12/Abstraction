package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayTravesingStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size = ");
		int size = scan.nextInt();
	     String[] arr= new String[size];
		for(int i =0;i<size;i++) {
			System.out.println("enter the "+(i+1)+"=");
			arr[i] = scan.next();
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
