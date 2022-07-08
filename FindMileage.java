package assignment_june;

import java.util.Scanner;

public class FindMileage {

	private static int calculateMileage(int cc) {
		int mileage=0;
		if(cc>=100&&cc<=125)
			mileage=75;
		else if(cc>=126&&cc<=135)
			mileage=70;
		else if(cc>=136&&cc<=150)
			mileage=60;
		else if(cc>=151&&cc<=200)
			mileage=50;
		else
			mileage=35;
		return mileage;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int cc = scanner.nextInt();
		if(cc<100) {
			System.out.println("too small");
		}else if(cc>220) {
			System.out.println("too big");
		}else {
			int out = calculateMileage(cc);
			System.out.println(out);
		}

	}



}
