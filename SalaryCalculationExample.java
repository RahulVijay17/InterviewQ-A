package assignment_june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryCalculationExample {
	
	private static float calculateGross(int basic, int days) {
		float rent = (float) (basic*0.5);//50%
		float specialAllowance = (float) (basic*0.75);//0%
		if(days==31) {
			return  rent+specialAllowance+basic+500;
		}else
			return rent+specialAllowance+basic;
	}

	public static void main(String[] args) throws IOException {
	 
		Scanner scanner= new Scanner(System.in);
		DecimalFormat dfZero =new DecimalFormat("0.00");
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 
		System.out.println("enter the basic salary");
		int basic =scanner.nextInt();
		System.out.println("enter the days worked");
		int days = scanner.nextInt();
		if(basic>10000 ||days>31 ||days<=0 ||basic<0) {
			System.out.println("invalid input");
			System.exit(0);
		}else {
			String output=dfZero.format(calculateGross(basic,days));
			System.out.println(output);
	}
scanner.close();
	

}
}