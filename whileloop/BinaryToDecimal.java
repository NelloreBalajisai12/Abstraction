package com.kn.whileloop;

import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the binary number =");
		int binary = scan.nextInt();
		binaryconversion(binary);
	}

	 static void binaryconversion(int binary) {
		 int rem;
		 int i = 0;
		double decimal = 0;
		 while(binary>0) {
			rem  = binary%10;
			decimal = rem*Math.pow(2,i)+decimal;
			binary  = binary/10;
			i++;
		 }
		 System.out.println(decimal);
	}

}
