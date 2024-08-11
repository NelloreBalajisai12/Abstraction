import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the first number =");
		int n1 =scan.nextInt();
		System.out.println("enter the second number = ");
		int n2  = scan.nextInt();
		int res  = gcd(n1,n2);
		System.out.println(res);
	}

	public static int gcd(int n1, int n2) {
		if(n2== 0) {
			return n1;
		}
		else {
			return gcd(n2,n1%n2);
		}
	}

}
