import java.util.Scanner;

public class CalculatorAppif {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("choose a character +,-,*,/");
		System.out.println("+ --> addition");
		System.out.println("- --> subtraction");
		System.out.println("* --> Multiplication");
		System.out.println("/ --> division");
         char c = scan.next().charAt(0);
         
        if (c == '+') {
        	int a= scan.nextInt();
            int b= scan.nextInt();
        	System.out.println( "addtion of two numbers"+a+"+"+b+"="+(a+b));
        	
        }
        else if (c == '-') {
        	int a= scan.nextInt();
            int b= scan.nextInt();
        	System.out.println( "subtraction of two numbers"+a+"-"+b+"="+(a-b));
        	
        }
        else if (c == '*') {
        	int a= scan.nextInt();
            int b= scan.nextInt();
        	System.out.println( "multiplication of two numbers"+a+"*"+b+"="+(a*b));
        	
        }
        else if (c == '/') {
        	int a= scan.nextInt();
            int b= scan.nextInt();
        	System.out.println( "division of two numbers"+a+"/"+b+"="+(a/b));
        	
        }
        else {
        	System.out.println("invaild input");
        }
        	
        }
	

}
