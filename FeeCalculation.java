package assignment_june;

import java.util.Scanner;

public class FeeCalculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the fee");
		
		int fee = scanner.nextInt();
		 
		System.out.println("enter the marks");
		
		int marks=scanner.nextInt();
		
		if(fee>32767||fee<=0) {
			System.out.println("invalid fee");
		}else if(marks>100) {
			System.out.println("invalid marks");
		}else if(fee<0||marks<0) {
			System.out.println("invalid input");
		}else {
			if(marks>90) {
				System.out.println(fee-(fee*0.5));
			}else if(marks>80&&marks<=90) {
				System.out.println(fee-(fee*0.25));
			}else if(marks>=70&&marks<=80) {
				System.out.println(fee-(fee*0.1));
				
			}else {
				System.out.println(fee);
			}
		}

	}

}
