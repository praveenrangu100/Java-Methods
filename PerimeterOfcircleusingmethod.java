package methods;

import java.util.Scanner;

public class PerimeterOfcircleusingmethod {

	public static void main(String[] args) {
		getRadius();

	}
	public static void getRadius() {
		float radius= readData();
		System.out.println("Perimeter of circle " + (2* Math.PI*radius));
	}
	
	public static float readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius ");
		float radius = sc.nextFloat();
		return radius;
	}

}
