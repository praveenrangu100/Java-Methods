package methods;

import java.util.Scanner;

public class SwappingNumbersUsingMethods {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the first number");
			int num1 = sc.nextInt();
			
			System.out.println("enter the second number");
			int num2 = sc.nextInt();
			
			System.out.println(swap(num1,num2));
			

	}
	public static String swap(int num1,int num2) {
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		return "After swapping " + num1 +" " +num2;
	}

}
