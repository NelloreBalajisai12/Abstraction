import java.util.Scanner;

public class SquareOfnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int a = scan.nextInt();
		int Squareroot = Square(a);
		System.out.println("the square root of two numbers is  ="+Squareroot);
	}

	 static int Square(int a) {
		 
		return  a * a;
	}

}
