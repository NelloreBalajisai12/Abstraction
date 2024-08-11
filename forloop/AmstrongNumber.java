package com.kn.forloop;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number  =");
		int num = scan.nextInt();
		
		amstrong(num);
	}

	 static void amstrong(int num) {
		 int r;
		 int sum = 0;
		 int temp ;
		 temp = num;
		 while(num>0) {
			 r = num%10;
			 sum = sum+(r*r*r);
			 num = num/10;
		 }
		 if(temp == sum) {
			 System.out.println("amstrong number");
		 }
		 else {
			 System.out.println("its not a amstrong number");
		 }
	}

}
