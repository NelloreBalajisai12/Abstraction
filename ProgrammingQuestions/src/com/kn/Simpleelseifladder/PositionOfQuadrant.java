package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class PositionOfQuadrant {

	public static void main(String[] args) {
           Scanner scan  = new Scanner(System.in);
           System.out.println("enter coordinate 1 = ");
           int q1  = scan.nextInt();
           System.out.println("enter coordinate 2 = ");
           int q2 = scan.nextInt();
           positionofquadrant(q1,q2);

}

	private static void positionofquadrant(int q1, int q2) {
             if(q1 >0 && q2 >0) {
            	 System.out.println("quadrant 1");
             }
             else if(q1 <0 && q2 >0) {
            	 System.out.println("quadrant 2");
             }
             else if(q1 <0 && q2 <0) {
            	 System.out.println("quadrant 3");
             }
             else if(q1 >0 && q2 <0) {
            	 System.out.println("quadrant 4");
             }
	}
}