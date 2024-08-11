package com.kn.DoWhile;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		smallestdigit(num);
	}

	 static void smallestdigit(int num) {
		 int rem = 0;
		 int small  =9;
		 do {
			 rem = num%10;
			 if(rem<small) {
				 small= rem;
			 }
			 else{
				 small = small;
			 }
			 num = num/10;
		 }while(num>0);
		 System.out.println(small);
	 }

}
