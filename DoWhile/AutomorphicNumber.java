package com.kn.DoWhile;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		System.out.println(automorphic(num));
	
	}

	 static boolean automorphic(int num) {
		 int square = 0;
		 int rem =0;
		 do {
			square = num*num;
			rem = square%10;
			if(num == rem) {
				return true;
			}
			else {
				return false;
			}
		 }while(num>0);
	}

}
