package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class StudentScoredAbove {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter the marks of test 1 =");
          int test1 = scan.nextInt();
          System.out.println("enter the marks of test 2 =");
          int test2 = scan.nextInt();
          System.out.println("enter the marks of test 3 =");
          int test3 = scan.nextInt();
          StudentScore(test1,test2,test3);
	}

	 static void StudentScore(int test1, int test2, int test3) {
           if( test1 >50&&test2 >50&&test3>50) {
        	   if(((test1+test2+test3)/3) >= 80) {
        		   System.out.println("student is above average");
        	   }
        	   else {
        		   System.out.println("student is average");
        	   }
           }else {
        	   System.out.println("failed");
           }
	}

}
