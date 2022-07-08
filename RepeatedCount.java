package com.aravindh;

import java.util.Scanner;

public class RepeatedCount {
	private static int countRepeater(int[] array, int size, int search) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(search==array[i]) {
				count+=1;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		if (size < 0) {
			System.out.println("invalid input");
		} else {

			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("invalid input");
					break;
				}
			}
			

		}
		System.out.println("enter the element to search");
		int search=scanner.nextInt();
		int output=countRepeater(array,size,search);
		System.out.println("The repeated "+search+" count is " + output);
	}

	
}
