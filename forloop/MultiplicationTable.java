package com.kn.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the num = ");
		int num  = scan.nextInt();
		multiplicationtable(num);
	}

	 static void multiplicationtable(int num) {
           for(int i = 1;i<= 10;i++) {
        	   System.out.print(num *i+ " ");
           }
	}

}
