package com.kn.Simpleifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
         Scanner scan  = new Scanner(System.in);
         System.out.println("enter a number = ");
         int num = scan.nextInt();
         PositiveOrNegative(num);
	}

	 static void PositiveOrNegative(int num) {
           if (num > 0) {
        	   System.out.println("positive");
           }else {
        	   System.out.println("negative");
           }
	}

}
