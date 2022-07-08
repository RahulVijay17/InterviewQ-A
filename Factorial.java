package com.aravindh;

import java.util.Scanner;

public class Factorial {


	public static int[] digitStorage = new int[100];
	
	private static void digitFactorial(int input) {
		String number = String.valueOf(input);
		int fac=1;
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);//spliting integer
		    for(int k=1;k<=j;k++) {
		    	fac=fac*k;
		    }
		    digitStorage[i]=fac;
		    fac=1;
		    }
		for(int element:digitStorage) {
			if(element==0) {
				continue;
			}else
				System.out.println(element);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int input=scanner.nextInt();
		if(input>32767) {
			System.out.println("too greater");
		}else if(input<0) {
			System.out.println("too small");
		}else {
			digitFactorial(input);
		}
	
}

}
