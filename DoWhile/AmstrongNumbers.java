package com.kn.DoWhile;

import java.util.Scanner;

public class AmstrongNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start =");
		int start = scan.nextInt();
		System.out.println("enter the end =");
		int end = scan.nextInt();
		for(;start<end;start++)
        if(amstrong(start,end)) {
        	System.out.println(start);
        }
		
	}

	 static boolean amstrong(int start, int end) {
		 int rem = 0;
		 int cube =0;
		 int temp ;
			int sum = 0;
			temp = start;
			while(start>0) {
			rem = start%10;
			cube = rem*rem*rem;
			sum = cube+sum;
			start = start/10;
			 }
			 if(sum == temp) {
				 return true;				 
			 }
			 return false;
	}

}
