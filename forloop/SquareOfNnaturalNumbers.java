package com.kn.forloop;

import java.util.Scanner;

public class SquareOfNnaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  limit = ");
		int num = scan.nextInt();
		squareofnumbers(num);
	}

	 static void squareofnumbers(int num) {
		 int  square;
		 int res = 0;
		 for(int i = 1;i<=num;i++) {
			 square = i*i;
			 res = res+square;
		 }
		 System.out.println(res);
	}

}
