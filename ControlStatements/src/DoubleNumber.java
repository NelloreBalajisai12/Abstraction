import java.util.Scanner;

public class DoubleNumber {
      public static void main(String[] args) {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("enter a number = ");
    	  int a = scan.nextInt();
    	  System.out.println("doubled number ="+doubling(a));
      }

	 static int doubling(int a) {
		// TODO Auto-generated method stub
		return 2*a;
	}
}
