package com.aravindh;

import java.util.Scanner;

public class DivisibleAssignment {

	private static int divisibleByThree(int[] array, int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(array[i]%3==0) {
				count+=1;
			}
		}

		return count;
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
	System.out.println("the count of mutilples of three in the array is " + divisibleByThree(array, size));
}

	
}
