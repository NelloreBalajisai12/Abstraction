package com.kn.simpleswitchcase;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("enter the operation to perform");
            char c = scan.next().charAt(0);
            System.out.println("enter number 1 =");
            int a = scan.nextInt();
            System.out.println("enter number 2 =");
            int b = scan.nextInt();
            
            simplecalculator(c,a,b);
	}

	 static void simplecalculator(char c,int a,int b) {
            switch(c) {
            case '+':
            	Doaddition(a,b);
            	break;
            case '-':
            	Dosubtract(a,b);
            	break;
            case '*':
            	Domultiply(a,b);
            	break;
            
	 case '/':
     	Dodivision(a,b);
     	break;
     	default :
     		System.out.println("enter a valid operation");
     }
            
	}

	   static void Dodivision(int a, int b) {
		   System.out.println("the division of two numbers "+ (a/b));
	}

	static void Domultiply(int a, int b) {
		  System.out.println("the multiplication of two numbers "+ (a*b));
              		
	}

	static void Dosubtract(int a, int b) {
		  System.out.println("the subtraction of two numbers "+ (a-b));	
	}

	static void Doaddition(int a, int b) {
            System.out.println("the addition of two numbers "+ (a+b));		
            
	}

}
