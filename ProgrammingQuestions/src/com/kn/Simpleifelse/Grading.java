package com.kn.Simpleifelse;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter  marks  = ");
           int marks  = scan.nextInt();
           PassorFail(marks);
           
	}

	static void PassorFail(int marks) {
           if(marks >= 50) {
        	   System.out.println("pass");
           }
           else {
        	   System.out.println("fail");
           }
	}

}
