import java.util.Scanner;

public class DifferenceAlwaysPositive {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	int	a = scan.nextInt();
	int	b = scan.nextInt();
	if (a > b) {
		System.out.println("the difference is "+(a-b));
	}
	else {
		System.out.println("the diff"+(b-a));
	}
	}

}