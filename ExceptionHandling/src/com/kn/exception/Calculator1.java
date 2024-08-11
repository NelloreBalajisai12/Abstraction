package com.kn.exception;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println( "welcome to calculator ");
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 double div  =  0;
		 try {
			 div = a/b;
		 }catch(ArithmeticException ae) {
			 System.out.println("Zero division erro");
		 }
		 System.out.println(div);
		 System.out.println("thank u");
	}

}
