package com.kn.Simpleif;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter age = ");
          int age = scan.nextInt();
          EligibleVote(age);
        		  
	}

	 static void EligibleVote(int age) {
            if (age>=18) {
            	System.out.println("eligible for vote");
            }
            
	}

}
