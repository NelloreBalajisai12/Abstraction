package com.kn.Characters;

import java.util.Scanner;

public class CountingCharatersDemo {

	public static void main(String[] args) {
		// taking the input 
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter  the String =  ");
		String s  = scan.nextLine();
		// create a object
		CharactersCounting word = new CharactersCounting();
		// calling  the method 
		 word.charcterfinding(s);
		// close resoreces
		 scan.close();
		
	}

}
