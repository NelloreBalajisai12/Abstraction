import java.util.Scanner;

public class CurrencyConveter {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount in INR =");
        int indiancurrency = scan.nextInt();
        System.out.println("the conversion from indian rupee to dollar ="+DollarConverter(indiancurrency));
        System.out.println("the conversion from indian rupee to pound="+PoundConveter(indiancurrency));
        	}

	  static double PoundConveter(int indiancurrency) {
		return indiancurrency/105.527;
	}

	static double DollarConverter(int indiancurrency) {
		return indiancurrency/83.237;
	}

}
