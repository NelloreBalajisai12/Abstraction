package com.kn.Nestedloop;

public class Pattern24 {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print((char)(i+64));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
