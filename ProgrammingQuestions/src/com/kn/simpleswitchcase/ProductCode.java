package com.kn.simpleswitchcase;

import java.util.Scanner;

public class ProductCode {

	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the code = ");
            int code = scan.nextInt();
            productname(code);
	}

	 static void productname(int code) {
         switch(code) {
         case 1 :
 			System.out.println("milk");
 			break;
 		case 2 :
 			System.out.println("water");
 			break;
 		case 3 :
 			System.out.println("sugar");
 			break;
 		case 4 :
 			System.out.println("coffe");
 			break;
 		case 5 :
 			System.out.println("cup");
 			break;
 			default:
 				System.out.println("enter a valid code");
         }
	}

}
