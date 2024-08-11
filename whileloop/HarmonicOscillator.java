package com.kn.whileloop;

import java.util.Scanner;

public class HarmonicOscillator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n = ");
		int n = scan.nextInt();
		harmonicseries(n);
	}

	 static void harmonicseries(int n) {
		 double rem = 0;
		 double sum = 0;
		 double i = 1;
		 while(i<=n) {
			 rem = 1/i;
			 sum = sum+rem;
			 i++;
		 }
		 System.out.println(sum);
	}

}
