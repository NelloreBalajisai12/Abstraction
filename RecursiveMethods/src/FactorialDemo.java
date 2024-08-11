import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number for fact");
		int n = scan.nextInt();
		int res =  fact(n);
		System.out.println(res);
	}

	public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n*(fact(n-1));
		}
	}
	

}
