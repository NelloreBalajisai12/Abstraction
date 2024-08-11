package com.kn.DoWhile;

import java.util.Scanner;

public class ProductOfFirstNOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num  = scan.nextInt();
		product(num);
	}

	 static void product(int num) {
		 int i =1;
		 int count =0;
		 int product = 1;
		 do {
			 if(i%2!=0) {
				 product = i*product;
				 count++;
			 }
			 i++;
		 }while(num != count);
		 System.out.println(product);
	}

}
