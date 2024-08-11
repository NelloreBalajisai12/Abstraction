package com.kn.simpleswitchcase;

import java.util.Scanner;

public class Alphaconversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int num = scan.nextInt();
		conversion(num);
		
	}

	 static void conversion(int num) {
		 switch(num){
		 case 1:
			 System.out.println("A");
			 break;
		 case 2:
			 System.out.println("B");
			 break;
		 case 3:
			 System.out.println("C");
			 break;
		 case 4:
			 System.out.println("D");
			 break;
		 case 5:
			 System.out.println("E");
			 break;
		 case 6:
			 System.out.println("F");
			 break;
		 case 7:
			 System.out.println("G");
			 break;
		 case 8:
			 System.out.println("H");
			 break;
		 case 9:
			 System.out.println("I");
			 break;
		 case 10:
			 System.out.println("J");
			 break;
			 default:
				 System.out.println("enter  1- 10  numbers");
		 }
	}

}
