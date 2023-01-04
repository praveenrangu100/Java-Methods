package methods;

import java.util.Scanner;

public class AdditionUsingMethods {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the first number");
			int num1 = sc.nextInt();
			
			System.out.println("enter the second number");
			int num2 = sc.nextInt();
			
			System.out.println("Addition of two numbers is " + performAddition(num1,num2));
			
	}
	public static int performAddition(int num1,int num2) {
		int result = num1 +num2;
		return result;
	}

}
