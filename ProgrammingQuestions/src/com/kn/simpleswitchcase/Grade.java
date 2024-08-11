package com.kn.simpleswitchcase;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the grade = ");
         char c  = scan.next().charAt(0);
         graderange(c);
	}

	 static void graderange(char c) {
        switch(c) {
        case 'A':
        	System.out.println("range from 91-100");
        	break;
        case 'B':
        	System.out.println("range from 81-90");
        	break;
        case 'C':
        	System.out.println("range from 71-80");
        	break;
        case 'D':
        	System.out.println("range from 61-70");
        	break;
        case 'F':
        	System.out.println("less than 50");
        	break;
        	default:
        		System.out.println("enter a vaild grade");
        }
	}

}
