package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the limit");
		int num = scan.nextInt();
		perfectNumber(num);
	}

	 static void perfectNumber(int num) {
		 int diviors =0;
		 int i =1;
		 while(i<=num) {
			 int j =1;
			 int sum =0;
			 while(j<i){
				 if(i%j == 0) {
					 diviors=j;
					 sum = diviors+sum;
				 }
				 j++;
				 
			 }
			 if(i == sum) {
				 System.out.println(i);
			 }
			 i++;
		 }
	}

}
