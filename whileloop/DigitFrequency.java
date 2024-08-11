package com.kn.whileloop;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num = ");
		long num  =  scan.nextLong();
		System.out.println("enter the digit =");
		int digit = scan.nextInt();
		digitfrequency(num,digit);
	}

	 static void digitfrequency(long num, int digit) {
		 long rem = 0;
		 int count = 0;
		 while(num>0) {
			 rem = num%10;
			 if(rem == digit) {
				 count++;
			 }
			 num  = num/10;
		 }
		 System.out.println(count);
	}

}
