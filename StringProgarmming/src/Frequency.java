import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String =");
		String s  = scan.nextLine();
		char[] crr = s.toCharArray();
		int vowelupper = 0;
		int vowellower = 0;
		int consupper = 0;
		int conslower = 0;
		int space = 0;
		int digit = 0;
		int special =0;
		for(int i =0;i<crr.length;i++) {
			if(crr[i]>=65&&crr[i]<=90) {
				if(crr[i]=='A'|| crr[i] == 'E'||crr[i]=='O'||crr[i]=='I'||crr[i]=='U') {
					vowelupper++;
				}else {
					consupper++;
				}
			}
			else if(crr[i]>=97&&crr[i]<=123) {
				if(crr[i]=='a'|| crr[i] == 'e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u') {
					vowellower++;
				}
				else {
					conslower++;
			}
			}
			else if(crr[i]== ' ') {
				space++;
			}
			else if(crr[i]>=48&&crr[i]<=57) {
				digit++;
			}
			else {
				special++;
			}
				
		}
		System.out.println(" upper case vowel = "+vowelupper);
		System.out.println(" lower case vowel = "+vowellower);
		System.out.println(" lower case cons = "+conslower);
		System.out.println(" upper case cons = "+consupper);
		System.out.println("  space = "+space);
		System.out.println(" digit = "+digit);
		System.out.println(" Special character = "+special);
	}

}
