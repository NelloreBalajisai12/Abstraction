import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number=");
		int a = scan.nextInt();
		if(a%2==0) {
			System.out.println("IT IS EVEN NUMBER");
		}else {
			System.out.println("ODD NUMBER");
		}
	}

}
