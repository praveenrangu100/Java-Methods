package methods;

import java.util.Scanner;

public class MinutesToYearsDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in minutes");
		int minutes = sc.nextInt();
		System.out.println(convertMtoYearsDays(minutes));
	}
	public static String convertMtoYearsDays(int minutes){
		int minutes1 = (minutes);
		double year= (minutes/525600);
		double day= ((minutes/1440)%365);
		double hour = (minutes/60)%24;
		double minute= minutes%60;
		return year+" years "+day+" days "+hour+" hours "+minute+" minutes";
	}
	
}
		
