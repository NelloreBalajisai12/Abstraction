package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNUmber {

	public static void main(String[] args) {
         Scanner scan =  new Scanner(System.in);
         System.out.println("enter the base  = ");
         int base = scan.nextInt();
         System.out.println("enter the power = ");
         int power  = scan.nextInt();
         powerofnum(base,power);
	}

	 static void powerofnum(int base, int power) {
		 int num = 1;
		 for(int i =1;i<=power;i++) {
			 num = num*base;
			 
		 }
		 System.out.println(num);
	}

}
