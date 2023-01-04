package methods;

import java.util.Scanner;

public class SpeedinMPS {
	public static void main(String[] args) {
		convertTtoMps();
	}
	public static void convertTtoMps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in meters ");
		float distance = sc.nextFloat();
		System.out.println("enter time in hours ");
		float hour = sc.nextFloat();
		System.out.println("enter time in minutes ");
		float minutes = sc.nextFloat();
		System.out.println("enter time in seconds ");
		float seconds = sc.nextFloat();
		float timeseconds = (hour*3600) + (minutes*60) + seconds;
		float mps = distance/timeseconds;
		float kmph = (distance/1000.f)/(timeseconds/3600.0f);
		float mph = kmph/1.609f;
		System.out.println("Speed in Meters/second "+ mps);
		System.out.println("Speed in KMPH " + kmph);
		System.out.println("Speed in Miles/Hour "+mph);
	}
}
