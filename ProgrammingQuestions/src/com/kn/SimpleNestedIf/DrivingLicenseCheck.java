package com.kn.SimpleNestedIf;

import java.util.Scanner;

public class DrivingLicenseCheck {

	public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter age  =");
        int age  = scan.nextInt();
        System.out.println("enter vision score = ");
        float visionScore = scan.nextFloat();
         drivinglicenseCheck(age,visionScore);
	}

	 static void drivinglicenseCheck(int age, float visionScore) {
		 if(age>= 18 && age <= 59) {
			 if(visionScore <= 0.5) {
				 System.out.println("eligible for license");
			 }else {
				 System.out.println("over sight ");
			 }
		 }else {
			 System.out.println("under or over age");
		 }
	}

}
