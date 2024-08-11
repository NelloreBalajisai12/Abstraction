package com.kn.Simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter a age = ");
         int age = scan.nextInt();
         boolean IsAdult = IsAdult(age);
         if (IsAdult == true) {
        	 System.out.println("he is adult");
         }
         else {
        	 System.out.println("he is not adult");
        	 scan.close();
         }
	}

	static boolean IsAdult(int age) {
		if (age >= 21) {
			return true;
		}
		else {
		return false;
		}
	}
}
