package com.kn.reverseString;

import java.util.Scanner;

public class ReveseStringDemo {

	public static void main(String[] args) {
		// input string
		Scanner scan  = new Scanner(System.in);
		System.out.println(" enter the string = ");
		String reverseString = scan.nextLine();
		// object creation 
		ReverseString reversestring = new ReverseString();
		// method calling
		String s1  = reversestring.reversingmethod(reverseString);
		// printing the reverse string
		System.out.println(s1);
		//closing resourcses
		scan.close();
	}

}
