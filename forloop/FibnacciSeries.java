package com.kn.forloop;

import java.util.Scanner;

public class FibnacciSeries {

	public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("enter the number=");
              int num  = scan.nextInt();
              fibonacci(num);
	}

	 static void fibonacci(int num) {
			 int num1 = 0;
			 int num2 = 1;
			 System.out.print(num1 + " " +num2);
			 for(int i = 2; i<=num;i++) {
			 int num3 = num1+num2;
			   num1 = num2;
			   num2 = num3;
			   System.out.print(" "+num3);
			   
				
			}
			    
			   
		 }
	}


