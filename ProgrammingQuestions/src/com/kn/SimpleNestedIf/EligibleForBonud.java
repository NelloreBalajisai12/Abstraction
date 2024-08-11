package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class EligibleForBonud {

	public static void main(String[] args) {
            Scanner scan =  new Scanner(System.in);
            System.out.println("enter the   how many years of exp = ");
            int exp = scan.nextInt();
            isbonus(exp);
            
	}

	 static void isbonus(int exp) {
              if (exp >3) {
            	  System.out.println("bonus available");
            	  if (exp >3 && exp <5) {
            		  System.out.println("% 5 bonus ");
            	  }
            	  if(exp >5 && exp <7 ) {
            		  System.out.println("10 % bonus");
            	  }
            	  if (exp>8 && exp <10  ) {
            		  System.out.println("20 % bonus");
            	  }
              }
	}

}
