package com.kn.anagarm;

import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) {
		// taking the input
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the first String");
		String a = scan.nextLine();
		System.out.println("enter teh second String");
		String b  =scan.nextLine();
		// create a obj
		Anagram word  = new Anagram();
		// calling the function
		boolean output = word.IsAnagram(a,b);
		//printing the result
		if(output) {
			System.out.println(" anagram");
		}
		else {
			System.out.println(" not a anagram");
			
		}
		
	}




}
