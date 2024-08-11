
package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter marks = ");
		int marks = scan.nextInt();
		GradeCheck(marks);
	}

	 static void GradeCheck(int marks) {
		 if(marks>= 90&& marks<=100) {
			 System.out.println("A");
		 }
		 else if(marks>= 80&& marks<=89) {
			 System.out.println("B");
		 }
		 else if(marks>= 70&& marks<=79) {
			 System.out.println("C");
		 }
		 else if(marks>= 60&& marks<=69) {
			 System.out.println("D");
		 }
		 else  if(marks<60) {
			 System.out.println("F");
		 }
	}

}
