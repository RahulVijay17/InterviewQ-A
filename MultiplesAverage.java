package com.aravindh;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplesAverage {

	private static float findAverageByFive(int input) {
		int count=0,result=0; 
		for(int i=1;i<=input;i++) {
			 if(i%5==0) {
				 result+=i;
				 count++;
			 }
		 }
		float output=(float) result/count;
		return output;
	}
	public static void main(String[] args) {
		DecimalFormat dfZero =new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number ");
		int input=scanner.nextInt();
		if(input<0||input>32767) {
			System.out.println("invalid output");
		}else {
			float out=findAverageByFive(input);
			String output=dfZero.format(out);
			System.out.println(output);
		
		}
	}

	

}
