package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			System.out.println("the"+(i+1)+"element = ");
		arr[i]= scan.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
