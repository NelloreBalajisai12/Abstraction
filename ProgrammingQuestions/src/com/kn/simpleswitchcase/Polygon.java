package com.kn.simpleswitchcase;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter sides of a polygon =");
		int sides = scan.nextInt();
		polygonname(sides);
		
	}

	 static void polygonname(int sides) {
		 switch(sides) {
		 case 3 :
			 System.out.println("triangle");
			 break;
		 case 4 :
			 System.out.println("Quadrilateral");
			 break;
		 case 5 :
			 System.out.println("Pentagon");
			 break;
		 case 6 :
			 System.out.println("Hexagon");
			 break;
		 case 7 :
			 System.out.println("Heptagon");
			 break;
		 case 8 :
			 System.out.println("Octagon");
			 break;
		 case 9 :
			 System.out.println("Nonagon");
			 break;
		 case 10 :
			 System.out.println("Decagon");
			 break;
		 case 11 :
			 System.out.println("Hendecagon");
			 break;
		 case 12 :
			 System.out.println("Dodecagon");
			 break;
			 default:
				 System.out.println("enter range 3- 12");
			 
		 }
	}

}
