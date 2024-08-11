import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String ");
		String s = scan.nextLine();
		char[] crr = s.toCharArray();
		char[] out = sort(crr);
		int count = 1;
		for(int i = 0;i<out.length-1;i++) {
			if(crr[i]==crr[i+1]) {
				count++;
			}
			else if(crr[i]!=crr[i+1]) {
				System.out.println(crr[i]+"="+count);
				count = 1;
			}
			if(i+1==out.length-1) {
				System.out.println(crr[i]+"="+count);
			}
		}
		}

	public static char[] sort(char[] crr) {
		for(int i =0;i<=crr.length-1;i++) {
			for(int j =i+1;j<=crr.length-1;j++) {
				if(crr[i]>crr[j]) {
					char temp  = crr[i];
					crr[i]= crr[j] ;
					crr[j] =temp;
				}
			}
		}
		return crr;
	}

}
