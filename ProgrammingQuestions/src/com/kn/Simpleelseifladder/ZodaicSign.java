package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class ZodaicSign {

	public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("enter the day");
              int  day = scan.nextInt();
              System.out.println("enter month");
              int month = scan.nextInt();
              System.out.println("enter year");
              int year = scan.nextInt();
              Zodiac(day, month, year);
	}

	 static void Zodiac(int day, int month, int year) {
		if((day>= 21&& month == 3 && day <= 31)|| (day>=1 && month == 4 && day<= 19)) {
			System.out.println("Aries");
		}
		else if((day>= 20&& month == 4 && day <= 30)|| (day>=1 && month == 5 && day<= 20)) {
			System.out.println("Taurus");
		}
		else if((day>= 21&& month == 5 && day <= 31)|| (day>=1 && month == 6 && day<= 20)) {
			System.out.println("Gemini");
		}
		else if((day>= 21&& month == 6 && day <= 30)|| (day>=1 && month == 7 && day<= 22)) {
			System.out.println("Cancer");
		}
		else if((day>= 23&& month == 7 && day <= 31)|| (day>=1 && month == 8 && day<= 22)) {
			System.out.println("Leo");
		}
		else if((day>= 23&& month == 8 && day <= 31)|| (day>=1 && month == 9 && day<= 22)) {
			System.out.println("vigro");
		}
		else if((day>= 23&& month == 9 && day <= 30)|| (day>=1 && month == 10 && day<= 22)) {
			System.out.println("libra");
		}
		else if((day>= 23&& month == 10 && day <= 31)|| (day>=1 && month == 11 && day<= 21)) {
			System.out.println("Scorpio");
		}
		else if((day>= 22&& month == 11 && day <= 30)|| (day>=1 && month == 12 && day<= 21)) {
			System.out.println("sagittarius");
		}
		else if((day>= 22&& month == 12 && day <= 31)|| (day>=1 && month == 1 && day<= 19)) {
			System.out.println("capricorn");
		}
		else if((day>= 20&& month == 1 && day <= 31)|| (day>=1 && month == 2 && day<= 18)) {
			System.out.println("Aquaris");
		}
		else if((day>= 19&& month == 2 && day <= 29)|| (day>=1 && month == 3 && day<= 20)) {
			System.out.println("pisces");
		}
		
		
		
		
	}

}
