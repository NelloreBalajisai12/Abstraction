package com.kn.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println(" welcome to shoppping mall");
		shop();
	}

	private static void shop() {
		System.out.println("shopping ");
		try {
		pay();
		}catch(Exception e ) {
			System.out.println("payment  not completed ");
		}
		System.out.println("Shopping done");
	}

	private static void pay() throws InputMismatchException{
		System.out.println(" enter the amount  = ");
		Scanner scan = new Scanner(System.in);
		try {
		 double amount = scan.nextDouble();
		}
		catch(InputMismatchException ime ){
			System.out.println("exception handled");
			throw ime;
		}
		
		System.out.println("payment done");
		 
	}

}
