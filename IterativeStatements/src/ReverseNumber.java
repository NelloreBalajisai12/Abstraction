import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int count,sum=0;;
         int num = scan.nextInt();       
         for (count = 0;num!=0;count++ ) {
         int rem ;
         rem = num %10;
         System.out.print(rem);
         sum = sum + rem;
         num = num/10;
         
         }
         System.out.println();
         System.out.println("the sum is "+sum);
         System.out.println("count is "+count);         
	}

}
