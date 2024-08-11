import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a =  scan.nextInt();
       if(a>10) {
    	   System.out.println("if body");
       
          if(a>15) {
        	  System.out.println(" nested if body");
          }
          else {
        	  System.out.println("if nested else body");
          }
       }
	 else {
		 System.out.println("else body");
		 
		 if(a>5) {
       	  System.out.println(" nested if else body");
         }
         else {
       	  System.out.println("else nested else body");
         }
		 
	}
	}	
	}


