package com.kn.forloop;

import java.util.Scanner;


public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the limit = ");
		int limit = scan.nextInt();
		prime(limit);
	}

	 static void prime(int limit) {
		int m = 0;
		while(m<limit) {
		 for(int num = 2; m<limit; num++) {
			 int count = 0;
			 for(int i= 1;i<=num;i++) {
				 if(num%i == 0) {
					 count ++;
				 }
				 }
			 if(count == 2) {
				 System.out.print(num+" ");
				 m++;
			 }
		 }
		 
		}
	}

	 }
