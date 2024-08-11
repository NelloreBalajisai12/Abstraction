package com.kn.exception1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		try {
		System.out.println("enter the size of array");
		int [] arr  =  new int[scan.nextInt()];
		System.out.println("enter the  index");
		int index   = scan.nextInt();
	    System.out.println("enter the element ");
	    int ele  =scan.nextInt();
	    int a  = scan.nextInt();
	    int b = scan.nextInt();
	    int div  = a/b;
		}
		catch(Exception e  ) {
			System.out.println("exception occured");
			e.printStackTrace();
		
		}
	}

}
