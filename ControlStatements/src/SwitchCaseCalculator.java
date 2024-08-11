import java.util.Scanner;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter a character= ");
       System.out.println("- for subtracting");
       System.out.println("* for multiplication");
       System.out.println("/ for division");
       System.out.println("% for modulo");
       char c = scan.next().charAt(0);
       switch (c) {
       case '-':
    	   System.out.println("enter two numbers");
    	   dosubtract(scan.nextInt(),scan.nextInt());
       break;
       case '*':
    	   System.out.println("enter two numbers");
    	   multiply(scan.nextInt(),scan.nextInt());
    	   break;
       case '/':
    	   System.out.println("enter two numbers");
    	   dodivision(scan.nextDouble(),scan.nextDouble());
    	   break;
       case '%':
    	   System.out.println("enter two numbers");
    	   domodulo(scan.nextInt(),scan.nextInt());
    	   break;
    	  default:
    		  System.out.println("invalid character");
       }
	}
	 static void dosubtract(int a, int b) {
		System.out.println("enter two numbers");
		System.out.println("the subtraction of two numbers "+a+"-"+b+"="+(a-b));
		
		
	}
	 static void multiply(int a, int b) {
			System.out.println("the multiplication of two numbers "+a+"*"+b+"="+(a*b));
			
			
		}
	 static void dodivision(double a,double b) {
			System.out.println("the division of two numbers "+a+"/"+b+"="+(a/b));
			
			
		}
	 static void domodulo(int a, int b) {
			
			System.out.println("the modulo of two numbers "+a+"%"+b+"="+(a%b));
			
			
		}

}
