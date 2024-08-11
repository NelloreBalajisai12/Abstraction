package com.kn.DoWhile;

import java.util.Scanner;
import java.util.*;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num = ");
		int num = scan.nextInt();
		sumofseries(num);
	}

	 static void sumofseries(int num) {
		 double square =0;
		 double sum  = 0;
		 int i =1;
		 do {
			 square = Math.pow(i, 2);
			 sum  = sum+square;
			 i++;
		 }while(i<=num);
		 System.out.println(sum);
	}

}
