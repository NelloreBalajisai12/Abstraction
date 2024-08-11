import java.util.Scanner;

public class PreservingSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String  = ");
		String s = scan.nextLine();
		char[] crr = s.toCharArray();
		char[] rrr=new char[crr.length] ;
		for(int i =0;i<crr.length;i++) {
			if(crr[i] ==' ') {
                 rrr[i]=' ';    
			}
		}
		int j=crr.length-1;
		for(int i = 0;i<crr.length;i++) {
			if(crr[i]!=' ') {
					if(rrr[j]==' ') {
				j--;
			}
					rrr[j] = crr[i];
					j--;
			}
		}
		System.out.println(rrr);
	}

}
