package com.kn.Longest;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
	// taking the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String  = ");
		String  s = scan.nextLine();
          String f = "";
		// create a object
		Longestt word =  new Longestt();
		// calling the method using object
		String out = word.longestword(s,f);
		System.out.println(out);
		//
		
		}

}
