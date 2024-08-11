package com.kn.DoWhile;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number = ");
		int num  = scan.nextInt();
		productofeven(num);
	}

	 static void productofeven(int num) {
		 int count  =0;
		 int product =1;
		 int i =1;
		 do {
			if(i%2 == 0) {
				product  = product*i;
				count++;
			}
			i++;
		 }while(count< num);
		 System.out.println(product);
	}

}
