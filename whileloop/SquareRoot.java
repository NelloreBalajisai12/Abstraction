package com.kn.whileloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		squareroot(num);
	}

	 static void squareroot(int num) {
		 int rem =0;
		 while(num>0) {
			 for(int i = 1;i<num;i++) {
			    if(num%i == 0) {
			    	if(i*i == num) {
			    	   System.out.println(i);
			    	}
			    }
			
			 }
			 break;
		 }
		 
	}

}
