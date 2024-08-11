import java.util.Scanner;

public class NumberIsPositiveorNegative {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
       if (number >= 0 ) {
    	   System.out.println("it is apositive number");
       }else {
    	   System.out.println("negative number");
       }
	}

}
