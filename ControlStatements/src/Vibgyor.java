import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
       System.out.println("enter a character");
       char c = scan.next().charAt(0);
       if(c == 'v' || c == 'V') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c == 'i' || c == 'I') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c == 'b' || c == 'B') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c ==  'G'|| c == 'g') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c == 'y' || c == 'Y') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c == 'O' || c == 'o') {
    	   System.out.println("it is a rainbow color");
       }
       else if(c == 'r' || c == 'R') {
    	   System.out.println("it is a rainbow color");
       }
       else {
    	   System.out.println("not a rainbow color");
       }
	}

}
