import java.util.Scanner;

public class ConvetLtohandHtoL {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the string = ");
		String s = scan.nextLine();
		String[] srr  = s.split(" ");
		for(int i =0; i<=srr.length-1;i++) {
			char[] crr = srr[i].toCharArray();
			for(int j =0;j<=crr.length-1;j++) {
				if(crr[j]>=97&&crr[j]<=122) {
					crr[j] = (char)(crr[j]-32);
					System.out.print(crr[j]);
					
				}
				else if (crr[j]>=65&&crr[j]<=90) {
					crr[j] = (char)(crr[j]+32);
					System.out.print(crr[j]);
				}
			}
			System.out.print(" ");
		}
	}

}
