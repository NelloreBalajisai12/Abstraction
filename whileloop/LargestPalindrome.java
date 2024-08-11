package com.kn.whileloop;

import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		largestpalindrome(num);
		
	}
	static void largestpalindrome(int num) {
		for(int i = 0;i<num;num--) {
		int temp = num;
		int rem =0;
		int palin = 0;
		while(num>0) {	 
			rem = num%10;
			palin = rem+(palin*10);
			num =num/10;
		}		
		if(temp == palin) {
			System.out.println(palin);;
			break;
		}
		num = temp;
		}
		 
		 }
		
	}

