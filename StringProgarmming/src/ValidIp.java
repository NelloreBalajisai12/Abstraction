import java.util.Scanner;

public class ValidIp {
	public static  void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the ip adress");
		String ip = scan.nextLine();
		 String[] srr = ip.split(".");
		 if(srr.length==4) {
		 for(int i =0;i<=srr.length-1;i++) {
			 char[] crr = srr[i].toCharArray();
			 
		 }
	}
	}

}
