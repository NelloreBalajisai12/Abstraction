package com.kn.forloop;

import java.util.Scanner;

public class Ispalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input =" );
		int num = scan.nextInt();
		
		ispalindrom(num);
	}

	 static void ispalindrom(int num) {
		 int temp = num;
		 int r = 0;
		 int sum = 0;
		 for(;num>0;) {
			 r = num %10;
			sum = (sum*10)+r;
			 System.out.print(r);
			 num = num/10;
		 }
		 if(sum==temp) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 }
	}

}
