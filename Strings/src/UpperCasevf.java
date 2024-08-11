import java.util.Scanner;

public class UpperCasevf {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println(" enter the string  =");
		 String s = scan.nextLine();
		 String[] input = s.split(" ");
		 for(int i =0;i<=input.length-1;i++) {
		   char[] word = input[i].toCharArray();
		   for(int j = 0;j<=word.length-1;j++) {
		     if(word[0]>=97&&(word[0])<=122) {
			    word[0] = (char)(word[0]-32);
		   }
			   System.out.print(word[j]);
		   }
		   System.out.print(" ");
			
		 }
 	}

}
