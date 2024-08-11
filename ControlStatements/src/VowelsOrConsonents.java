import java.util.Scanner;

public class VowelsOrConsonents {
	public static void main(String[] args) {
	    Scanner scan = new Scanner (System.in);
	       System.out.println("enter a character");
	       char c = scan.next().charAt(0);
	       if(c == 'a' || c == 'A') {
	    	   System.out.println("its a vowel");
	       }
	       else if(c == 'E' || c == 'e') {
	    	   System.out.println("its a vowel");	       }
	       else if(c == 'I' || c == 'i') {
	    	   System.out.println("its a vowel");	       }
	       else if(c ==  'o'|| c == 'O') {
	    	   System.out.println("its a vowel");	       }
	       else if(c == 'u' || c == 'U') {
	    	   System.out.println("its a vowel");	       }
	       else if(c == 'O' || c == 'o') {
	    	   System.out.println("its a vowel");	       }
	       else {
	    	   System.out.println("its  not a vowel");	       }
		}

	}

