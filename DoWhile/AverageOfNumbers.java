package com.kn.DoWhile;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range  =");
		int num = scan.nextInt();
		averagenum(num);
	}

	 static void averagenum(int num) {
		 int i= 1;
		 int avg = 0;
		double  count = 0;
		 do {
			 avg  = i+avg; 
			 i++;
			 count++;
		 }while(i<=num);
	System.out.println(avg/count);
	}

}
