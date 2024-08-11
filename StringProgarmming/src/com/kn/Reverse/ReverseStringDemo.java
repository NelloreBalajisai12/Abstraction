package com.kn.Reverse;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String = ");
		String  s = scan.nextLine();
		ResverseString str = new ResverseString();
		str.reveseString(s)
;		
	}

}
