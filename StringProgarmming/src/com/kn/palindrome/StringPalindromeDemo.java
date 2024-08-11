package com.kn.palindrome;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		// Taking input from user 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String s1  = scan.nextLine();
		//object creation 
		StringPalindrome palindrome = new StringPalindrome();
		// calling method using object
		String s2  = palindrome.stringPalindrome(s1);
		// checking whether it is a palindrome
		System.out.println(s2);
		 if(s1.equals(s2)) {
			 System.out.println("its is a palindrome");
		 }
	     else {
		    System.out.println("its is not a palindrome");
			 }
		 
		 // close all resources
		 scan.close();
		 }
	}


