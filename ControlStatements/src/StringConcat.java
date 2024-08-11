import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
          Scanner scan =  new Scanner(System.in);
        String  joinstring = contact();
        System.out.println("the concat of two strings is "+joinstring);
        
	}
   static  String  contact() {
	   Scanner scan =  new Scanner(System.in);
       System.out.println("enter the first name");
       String a = scan.nextLine();
       System.out.println("enter the middle name");
       String c = scan.nextLine();
       System.out.println("enter the second name");
       String b = scan.nextLine();
	   return a+" "+c+" "+ b;
   }

}
