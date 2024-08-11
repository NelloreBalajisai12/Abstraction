package com.kn.simpleswitchcase;

import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("enter the mont number");
           int month = scan.nextInt();
           monthName(month);
           
	}

	 static void monthName(int month) {
		 switch(month) {
		 case 1,3,5,7,8,10,12:
			 System.out.println("31 days");
		 break;
		 case 2:
			 System.out.println("28or 29 days");
			 break;
		 case 4,6,9,11 :
			 System.out.println("30 days");
		      break;
		      default:
		    	  System.out.println("enter range between 0-12");
			 
		 }
	}

}
