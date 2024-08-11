package com.kn.whileloop;

import java.util.Scanner;

public class SumofFirstNOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the limit =");
		int limit = scan.nextInt();
		sumofoddnumbers(limit);
	}

	 static void sumofoddnumbers(int limit) {
		 int i =0  ;
		 int sum = 0;
		 int count =0;
		 while(count<limit) {
			 if(i%2!=0) {
				 sum  = sum +i;
				 count++;
			 }
			 i++;
		 }
		 System.out.println(sum);
	}

}
