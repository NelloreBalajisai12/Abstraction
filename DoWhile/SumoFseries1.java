package com.kn.DoWhile;

import java.util.Scanner;

public class SumoFseries1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		sumof(num);
	}

	 static void sumof(int num) {
		 int i =1;
		double cube = 0;
		double sum = 0;
		 do {
			cube  = Math.pow(i, 3);
			sum = sum +cube;
			i++;
		 }while(i<=num);
		 System.out.println(sum);
	}

}
