package com.kn.Simpleifelse;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
          Scanner scan  = new Scanner(System.in);
          System.out.println("enter age = ");
          int age = scan.nextInt();
          Discountavailble(age);
          
	}

	 static void Discountavailble(int age) {
            if (age >60) {
            	System.out.println("senior citizen discount available");
            }
            else {
            	System.out.println("senior citizen discount not available");
            }
	}

}
