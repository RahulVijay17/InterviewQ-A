package com.aravindh;

import java.text.DecimalFormat;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dfZero =new DecimalFormat("0.00");
		System.out.println("enter the fahrenheit ");
		int fh=scanner.nextInt();
		if(fh>0) {
			
			String output=dfZero.format(convertToCentgrade(fh));
			System.out.println(output);
		}
		else
			System.out.println("invalid input");
	}

	private static float convertToCentgrade(int fh) {
		
		float cg=((fh-32)/9)*5;
		
		return cg;
		
		
	}

}
