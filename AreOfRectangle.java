package methods;

import java.util.Scanner;

public class AreOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		float length = sc.nextFloat();
		System.out.println("Enter the breadth");
		float breadth = sc.nextFloat();
		getArea(length,breadth);
	}
	public static void getArea(float l,float b) {
		System.out.println("Area of rectangle "+(l*b));
	}

}
