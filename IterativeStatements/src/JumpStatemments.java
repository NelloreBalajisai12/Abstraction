import java.util.Scanner;

public class JumpStatemments {

	public static void main(String[] args) {
       Scanner scan = new  Scanner(System.in);
       System.out.println("enter the range");
       int range =scan.nextInt();
       for(int i =1;i<=range;i++) {
    	   if(i%3==0) {
    		   System.out.println("divisible by 3");
    		   return;
    	   }
    	   else {
    		   System.out.println("not divisible by 3");
    	   }
    	   System.out.println("for loop");
       }
       System.out.println("end");
	}

	}
	

