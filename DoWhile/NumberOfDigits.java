package com.kn.DoWhile;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		digts(num);
	}

	 static void digts(int num) {
		 int rem = 0;
		 int count =0;
		 do {
			 rem  = num%10;
			 count++;
			 num = num/10;
		 }while(num>0);
		 System.out.println(count);
	}

}
