package com.kn.DoWhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		cuberoot(num);
	}

	 static void cuberoot(int num) {
		 int i =1;
		 do {
			 if(num%i==0) {
				 if(i*i*i==num) {
					 System.out.println(i);
				 }
			 }
			 i++;
		 }while(i<num);
	}

}
