package com.aravindh;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenAndOddPassword {
	
	private static float avgOddEvenSum(int[] array, int size) {

		int odd=0;
		int even=0;
		for (int i=0;i<size;i++) {
			if(array[i]%2==0) {
				even+=array[i];
			}else {
				odd+=array[i];
		}}
		System.out.println(odd);
		System.out.println(even);
		int out=odd+even;
		float average= (float) out/2;
		System.out.println(average);
		return average;
	}
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		int[] array = new int[size];
		if (size <= 0) {
			System.out.println("invalid array size");
		} else {

			System.out.println("enter the elements");
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("invalid input");
					break;
				}
			}
		}
		 float out=avgOddEvenSum(array,size);
		 DecimalFormat dfZero =new DecimalFormat("0.00");
		 String output=dfZero.format(out);
		 System.out.println("the password is " +output);
	}

	

}
