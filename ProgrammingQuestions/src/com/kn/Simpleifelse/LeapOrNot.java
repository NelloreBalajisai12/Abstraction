package com.kn.Simpleifelse;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("enter year = ");
              int year  = scan.nextInt();
              LeapOrNot(year);
	}

	 static void LeapOrNot(int year) {
            if(year % 4 == 0&& year % 100 != 0  || year % 400 == 0  ) {
            	System.out.println("year is leap year ");
            }
            else {
            	System.out.println("not leap year");
            }
	}

}
