package com.aravindh;

import java.util.Scanner;

public class LeapYear {
	
	private static int checkLeapYear(int year) {
		 if(year<0)
			return -1;
		 else {
			 if(year%4==0) {
				 if(year%100==0) {
					 if(year%400==0) {
						 return 1;
					 }else
						 return 0;
				 }else
					 return 0;
			 }else
				 return 0;
		 }		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the year");
		int year=scanner.nextInt();
		int out=(checkLeapYear(year));
		if(out==1) {
			System.out.println("leap year");
			
		}else if(out==-1) {
			System.out.println("invalid output");
		}else {
			System.out.println("not leap year");
		}
		
	}

	
}
