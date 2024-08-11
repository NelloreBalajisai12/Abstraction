package com.kn.forloop;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number until which u want to add");
		int num = scan.nextInt();
		int sum = 0;
		System.out.println(Sumofnnaturalnumbers(num,sum));
	}

	 static int Sumofnnaturalnumbers(int num,int sum) {
           for(int i =1;i<=num;i++) {
        	    sum = sum+i;
           }
           return sum;
           
	}

}
