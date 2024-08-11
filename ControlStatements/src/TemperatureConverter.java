import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
          Scanner scan = new Scanner (System.in);
          System.out.println("enter the temperture in farenhit=");
          double fareheit =scan.nextDouble();
          System.out.println("the coversion of temperature to celsius is ="+ConvertCelsius(fareheit));
	}

	 static double ConvertCelsius(double fareheit) {
		return ((fareheit-32)*5)/9;
	}

}
