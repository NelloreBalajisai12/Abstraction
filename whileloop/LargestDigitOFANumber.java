package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigitOFANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int num = scan.nextInt();
		largestDigit(num);
	}

	 static void largestDigit(int num) {
		 int r;
		 int com = 0;
		 int largest = 0;
		 while(num>0) {
			 r  =num %10;
			 if(com>r) {
				  largest= com;
			 }
			 else {largest = r;
			 }
			 com = largest;
			 num = num/10;
			 
		 }
		 System.out.print(largest);
	}

}
