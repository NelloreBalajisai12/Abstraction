import java.util.Scanner;

public class SecrectSpy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		char a = scan.next().charAt(0);
		System.out.println("the decoded "+decoder(a));
	}

	 static int decoder(char a) {
		 return (int )a ;
		 
	}

}
