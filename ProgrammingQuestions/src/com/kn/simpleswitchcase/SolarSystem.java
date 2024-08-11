package com.kn.simpleswitchcase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name of planet = ");
		String planet = scan.nextLine();
		OrderOfPlanets(planet);
	}

	 static void OrderOfPlanets(String planet) {
		 switch(planet) {
		 case"Mercury":
			 System.out.println("1");
			 break;
		 case"Venus":
			 System.out.println("2");
			 break;
		 case"Earth":
			 System.out.println("3");
			 break;
		 case"Mars":
			 System.out.println("4");
			 break;
		 case"Jupiter":
			 System.out.println("5");
			 break;
		 case"saturn":
			 System.out.println("6");
			 break;
		 case"Uranus":
			 System.out.println("7");
			 break;
		 case"Neptune":
			 System.out.println("8");
			 break;
			 default:
				 System.out.println("invalid planet");
		 }
	}

}
