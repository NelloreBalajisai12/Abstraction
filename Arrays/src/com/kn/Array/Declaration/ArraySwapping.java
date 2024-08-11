package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArraySwapping {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int temp = arr[0];
		for(int i =0;i<=arr.length-1;i++) {
			if(i==0) {
				arr[0]=arr[arr.length-1];
			}
			else if(i == arr.length-1) {
			    arr[arr.length-1]=temp;	
			    System.out.println(arr[arr.length-1]);
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
