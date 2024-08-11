import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks = ");
		int marks = scan.nextInt();
		if(marks>=90) {
			System.out.println("a - grade");
		}
		else if(marks>=75 && marks < 90) {
			System.out.println("b - grade");
		}
		else if(marks>=60 && marks < 75) {
			System.out.println("c - grade");
		}
		else {
			System.out.println("re attempt");
		}
		
	}

}
