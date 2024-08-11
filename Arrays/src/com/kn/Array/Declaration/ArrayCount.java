package com.kn.Array.Declaration;

public class ArrayCount {
	public void arraycount(int[]arr) {
		int evencount =0;
		int oddcount =0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]+"is a even number");
				evencount++;
			}
			else {
				System.out.println(arr[i]+"is a odd number");
				oddcount++;
			}
		}
		System.out.println("even count = "+evencount);
		System.out.println("odd count = "+oddcount);
		
	}
}
