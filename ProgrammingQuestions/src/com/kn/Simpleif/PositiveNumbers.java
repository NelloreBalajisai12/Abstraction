package com.kn.Simpleif;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a number = ");
            int num = scan.nextInt();
            boolean ispositive = ispositive(num);
            if(ispositive==true) {
            	System.out.println("it is positive number");
            }
            else {
            	System.out.println("its a negative number");
            }
	}

	 static boolean ispositive(int num) {
		   if(num>0) {
			   return true;
		   }else {
		return false;
		   }
	}

}
//output
//enter a number = 
//20
//it is positive number
