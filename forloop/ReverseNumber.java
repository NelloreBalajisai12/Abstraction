package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter number  = ");
		int num  = scan.nextInt();
		reversenumber(num);
	}

	 static void reversenumber(int num) {
		 int r = 0;
		 for(;num>0;) {
			 r = num%10;
			 System.out.print(r);
			 num = num/10;
		 }
	}

}
