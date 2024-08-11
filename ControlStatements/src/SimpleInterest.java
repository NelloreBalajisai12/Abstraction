import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("enter principle=");
      int principle = scan.nextInt();
      System.out.println("enter interest=");
      double interest =scan.nextDouble();
      System.out.println("enter time=");
      double time = scan.nextDouble();
      System.out.println("the simple interest ="+simpleinterest(principle,interest,time));
    		  
    		  
      
	}

	 static double simpleinterest(int principle, double interest, double time) {
		// TODO Auto-generated method stub
		return (principle*interest*time)/100;
	}

}
