package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
               Scanner scan  = new Scanner(System.in);
               System.out.println("enter age");
               int age = scan.nextInt();
               ageClassification(age);
               scan.close();
	}

	 static void ageClassification(int age) {
             if( age > 0 && age <=12) {
            	 System.out.println("child");
             }
             else  if( age > 13 && age <=19) {
            	 System.out.println("teen");
             }
             else  if( age > 20 && age <=59) {
            	 System.out.println("adult");
             }
             else  if( age > 60) {
            	 System.out.println("senoir");
             }
	}

}
