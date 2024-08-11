package com.kn.DoWhile;

import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter the start =  ");
		int start = scan .nextInt();
		System.out.println("enter the end  =");
		int end  = scan.nextInt();
		System.out.println("enter the divior =");
		int divi = scan.nextInt();
		divisiblesum(start,end,divi);
	}

	 static void divisiblesum(int start, int end, int divi) {
		 int sum = 0;
		 int rem= 0;
		 do {
			 if(start%divi == 0 ) {
				 sum = sum+start;
			 }
			 start++;
		 }while(start<=end);
		 System.out.println(sum);
	}

}
