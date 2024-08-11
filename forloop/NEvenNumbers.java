package com.kn.forloop;

import java.util.Scanner;

public class NEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  the limit");
		int limit =scan.nextInt();
		nevennum(limit);
	}

	 static void nevennum(int limit) {
		 for(int i = 0;i<=limit;i++) {
			 if(i%2==0) {
				 System.out.print(i+" ");
			 }
		 }
	}

}
