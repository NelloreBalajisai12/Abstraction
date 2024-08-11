import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int age = scan.nextInt();
       if (age >= 18) {
    	   System.out.println("eligible to vote");
       }
       else {
    	   System.out.println("not eligible");
       }
	}

}
