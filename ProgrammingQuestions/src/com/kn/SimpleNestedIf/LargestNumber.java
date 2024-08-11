package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("enter the first number = ");
           int a = scan.nextInt();
           System.out.println("enter the second number = ");
           int b = scan.nextInt();
           System.out.println("enter the Third number = ");
           int c = scan.nextInt();
           Largestnumber(a,b,c);
	}

	 static void Largestnumber(int a, int b, int c) {
           if( (a != b)&& (b !=c ) && (a != c)) {
        	   if(a>b &&  a>c) {
        		   System.out.println("a is largest number ");
        	   }
        	   else if((b>a && b>c)) {
        		   System.out.println(" b is largest number");
        	   }
        	   else if (c>a &&  c>b ) {
        		   System.out.println("c is largest number");
        	   }
           }else {
        	   System.out.println("All are equal");
           }
	}

}
