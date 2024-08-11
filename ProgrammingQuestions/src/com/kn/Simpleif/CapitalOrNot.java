package com.kn.Simpleif;

import java.util.Scanner;

public class CapitalOrNot {

	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a character = ");
            char c = scan.next().charAt(0);
            Iscapital(c);
	}

	 static void Iscapital(char c) {
		 if ( c == 'A'|| c =='B'|| c ==  'C'|| c == 'D'||c =='E'||c =='F'||c =='G'||c =='H'||c =='I'||c =='J'||c =='K'|| c =='L'||c =='M'||c =='N'||c =='O'||c =='P'||c =='Q'||c =='R'||c == 'S'||c =='T'||c =='U'||c =='V'||c =='X'|| c =='Y'||c =='Z') {
			 System.out.println("capital letter");
		 }
		 
	}

}
