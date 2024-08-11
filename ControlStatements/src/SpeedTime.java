import java.util.Scanner;

public class SpeedTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the speed");
		double speed = scan.nextDouble();
		System.out.println("enter time");
		double time = scan.nextDouble();
		double distance = calculateDistance(speed,time);
		System.out.println("the distance = "+distance);
		}

	 static double calculateDistance(double speed, double time) {
		return speed *time;
	}

}
