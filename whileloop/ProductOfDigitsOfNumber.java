package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		ProductOfDigits(num);
	}

	 static void ProductOfDigits(int num) {
		 int rem  = 0;
		 int product = 1;
		 while(num>0) {
			 rem = num%10;
			 product = product*rem;
			 num =num/10;	 
		 }
		 System.out.println(product);
	}

}
