package com.kn.simpleswitchcase;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter traffic light color");
		String c = scan.nextLine();
		trafficlight(c);
		
	}

	 static void trafficlight(String c) {
		 switch(c) {
		 case"Red":
			 System.out.println("stop");
			 break;
		 case"Green":
			 System.out.println("go");
			 break;
		 case"Yellow":
			 System.out.println("Reay");
			 break;
			 default:
				 System.out.println("no such lights");
		 }
	}

}
