package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int num = scan.nextInt();
		sumofdigits(num);
	}

	 static void sumofdigits(int num) {
		 int r =0;
		 int sum =0;
		 for(;num>0;) {
			 r = num%10;
			 sum = sum+r;
			 num =num/10;
		 }
		 System.out.println("sum of digits =" +sum);
	}

}
