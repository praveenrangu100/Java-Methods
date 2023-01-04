package methods;

import java.util.Scanner;

public class InchesintoMeters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value in inches");
		float inches = sc.nextFloat();
		getInMeters(inches);
		

	}
	public static void getInMeters(float inches) {
		System.out.println("In Meters " + (inches*0.0254));
	}

}
