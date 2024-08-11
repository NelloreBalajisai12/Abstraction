package com.kn.whileloop;

import java.util.Scanner;

public class CountingNumberOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number =");
		int num = scan.nextInt();
		countingnumber(num);
	}

	 static void countingnumber(int num) {
		 int count = 0;
		 while(num>0) {
			 num = num/10;
			 count++;
			 
		 }
		 System.out.println(count);
	}

}
