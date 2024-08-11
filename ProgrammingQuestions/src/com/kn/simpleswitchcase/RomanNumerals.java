package com.kn.simpleswitchcase;

import java.util.Scanner;

public class RomanNumerals {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the roman number  = ");
		String c = scan.nextLine();
		conversionRoman(c);
		
	}

	 static void conversionRoman(String c) {
		 switch(c) {
		 case "I":
			 System.out.println("1.0");
			 break;
		 case "II":
			 System.out.println("2.0");
			 break;
		 case "III":
			 System.out.println("3.0");
			 break;
			 case "IV":
				 System.out.println("4.0");
				 break;
			 case "V":
				 System.out.println("5.0");
				 break;
			 case "VI":
				 System.out.println("6.0");
				 break;
				 default:
					 System.out.println("enter 1 - 6");
			 
		 }
	}

}
