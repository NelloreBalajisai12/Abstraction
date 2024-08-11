package com.kn.Array.Declaration;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a  = scan.nextInt();
		int[] arr  = new int[a];
		int[] brr  = new int[a];
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] =scan.nextInt();
		}
		for(int i = 0 ;i<brr.length;i++) {
			brr[i] =scan.nextInt();
		}
		int[] crr = new int[arr.length+brr.length];
		int c=0;
		int b=0;
		for(int i=0; i<=crr.length-1;i++) {
			  if(i%2==0) {
			    crr[i]=arr[c];
			   c++;
			}
			else {
				crr[i]=brr[b];
				b++;
			}
			}
		for(int i =0;i<=crr.length-1;i++) {
			System.out.print(crr[i]+" ");
		}
	}

}
