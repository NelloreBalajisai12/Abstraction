package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class CurrentCenturyYear {

	public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("enter the year = ");
               int year = scan.nextInt();
               CenturyOrNot(year);
               scan.close();
	}

	 static void CenturyOrNot(int year) {
            if(year % 4 == 0  ) {
            	System.out.println("leap year ");
            	if((year %100 ==0 && year %400==0)){
            		System.out.println("century year ");
            	}
            }
	}

}
