package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class Checkpositiveornegative {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter  a number  = ");
          int num = scan.nextInt();
          ispositive(num);
	}

	 static void ispositive(int num) {
             if (num >0 ) {
            	 System.out.println("positive number");
             }
             else if(num < 0) {
            	 System.out.println("negative  number ");
             }else if (num  == 0) {
            	 System.out.println("zero");
             }
             
	}

}
