package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class LoanChecker {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the person age");
         int age  = scan.nextInt();
         System.out.println("enter the income");
         int income = scan.nextInt();
         loanChecker(age,income);
	}

	 static void loanChecker(int age, int income) {
           if (age >= 21 && age <= 57) {
        	   if(income>13500) {
        		   System.out.println("loan qualified");
        	   }
           }
           else {
        	   System.out.println(" loan rejected ");
           }
	}

}
