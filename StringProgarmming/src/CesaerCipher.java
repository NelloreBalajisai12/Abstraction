import java.util.Scanner;

public class CesaerCipher {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter the String  = ");
		 String s  = scan.nextLine();
		 System.out.println("enter the jump =");
		 int n  = scan.nextInt();
		 
		char[] crr  = s.toCharArray();
		for(int i =0;i<=crr.length-1;i++) {
			if(crr[i]+n <=90) {
				
			crr[i] =(char)(crr[i]+n);
			}
			else {
				crr[i] =(char)(crr[i]+n-26);
			}
		}
		String output  = new String(crr);
		System.out.println(output);
	}

}
