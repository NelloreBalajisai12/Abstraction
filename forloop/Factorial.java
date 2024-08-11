package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number =");
		 long fact = 1;
		int num = scan.nextInt();
		System.out.println(factorial(num,fact));
		
		
	}

	 static long factorial(int num,long fact) {
		 for (int i= 1 ;i<=num;i++) {
			 fact=fact*i;
			 
		 }
		 return fact;
	}

}
