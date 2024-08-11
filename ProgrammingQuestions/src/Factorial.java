import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int fact = scan.nextInt();
		 int factorial =1;
		for(int i=1;i<=fact;i++) {
			factorial = factorial*i;
		}
		System.out.println("the factorial of the number "+fact+ " is = "+ factorial);
		}

}
