package com.kn.Simpleelseifladder;

import java.util.Scanner;

public class Identifier {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter a character");
          char c = scan.next().charAt(0);
          ischaractercheck(c);
	}

	 static void ischaractercheck(char c) {
            if(c == 'a'|| c == 'e' || c== 'i'||c == 'o'|| c == 'u') {
            	System.out.println("lower case vowel");
            }
            else if(c == 'A'|| c == 'E' || c== 'I'||c == 'O'|| c == 'U') {
            	System.out.println("upper case vowel ");
            }
            else if(c =='B'|| c ==  'C'|| c == 'D'||c =='F'||c =='G'||c =='H'||c =='J'||c =='K'|| c =='L'||c =='M'||c =='N'||c =='P'||c =='Q'||c =='R'||c == 'S'||c =='T'||c =='V'||c =='X'|| c =='Y'||c =='Z') {
            	System.out.println("upper case consonant");
            }
            else if(c =='b'|| c ==  'c'|| c == 'd'||c =='f'||c =='g'||c =='h'||c =='j'||c =='k'|| c =='l'||c =='m'||c =='n'||c =='p'||c =='q'||c =='r'||c == 's'||c =='t'||c =='v'||c =='x'|| c =='y'||c =='z') {
            	System.out.println("lower case consonant");
            }
            else if(c == '1'|| c == '2'|| c == '3' || c == '4'|| c== '5'|| c == '6'|| c=='7'|| c== '8'|| c== '9'|| c=='0') {
            	System.out.println("its a digit");
            }
            else {
            	System.out.println("special character");
            }
	}

}
