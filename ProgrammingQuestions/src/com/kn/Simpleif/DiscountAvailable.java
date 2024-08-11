package com.kn.Simpleif;

import java.util.Scanner;

public class DiscountAvailable {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("please enter amount");
         int amount = scan.nextInt();
          discountAvailable(amount);
	}      

       static  void discountAvailable(int amount) {
		if (amount>=100) {
				System.out.println("discount applicable");
			}
			
		}
}
		
		

