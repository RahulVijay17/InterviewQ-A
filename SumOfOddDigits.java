package com.aravindh;

import java.util.Scanner;

public class SumOfOddDigits {

	private static int sumOfOddDigits(int input) {
		int output=0;
		int sum=0;
		while(input>0) {
			int out=input%10;
			if(out%2!=0)
				output+=out;
			input=input/10;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number ");
		int input=scanner.nextInt();
		
		if(input<0||input>32767) {
			System.out.println("invalid output");
		}else {
			System.out.println(sumOfOddDigits(input));
		}
	}

	

}
