package com.kn.forloop;

import java.util.Scanner;

public class GcdOftwonumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number =");
		int num1 = scan.nextInt();
		System.out.println("enter the second number = ");
		int num2 = scan.nextInt();
		int gcd = 1;
		GCDOFtwonumbers(num1,num2,gcd);
	}

	 static void GCDOFtwonumbers(int num1, int num2,int gcd) {
		 for(int i = 1; i<=num1 && i<=num2; i++) {
			 if(num1%i == 0 && num2%i == 0) {
				 gcd  = i;
		 }
		 
	}
		 System.out.println(gcd);			 }

	 

}
