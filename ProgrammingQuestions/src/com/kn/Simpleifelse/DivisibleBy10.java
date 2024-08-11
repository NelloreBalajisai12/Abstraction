package com.kn.Simpleifelse;

import java.util.Scanner;

public class DivisibleBy10 {

	public static void main(String[] args) {
          Scanner scan  =new Scanner(System.in);
          System.out.println("enter the number = ");
          int num = scan.nextInt();
             divisibleby10(num);
	}

	 static void divisibleby10(int num) {
           if(num % 10 == 0) {
        	   System.out.println("number is  divisible by 10 ");
           }else {
        	   System.out.println("number is not divisible by 10");
           }
	}

}
