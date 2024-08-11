package com.kn.Array.Declaration;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] arr = new int[] {1,10,4,56,8};
		bubbllesort(arr);
	}

	 static void bubbllesort(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++ ) {
				 int temp =0;
			  if(arr[j]>arr[j+1]) {
				 temp = arr[j];
				 arr[j] = arr[j+1];
			     arr[j+1] = temp;
			}
			}
		 }
		 for(int i :arr) {
			 System.out.print(i+",");
		 }
	}

}
