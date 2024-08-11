package com.kn.DoWhile;

import java.util.Scanner;
import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num  = scan.nextInt();
		tobinary(num);
	}

	 static void tobinary(int num) {	
		 int rem= 0;
		 double binary = 0;
		 int i =0;
		 while(num>0) {
			rem = num%10;
			binary = Math.pow(2, i)*rem+binary;
			i++;
			num = num/10;
		 }
		 System.out.println(binary);
	}

}
