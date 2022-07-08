package com.aravindh;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeInteger {
	private static int secondLargest(int[] arrayOne, int sizeOfArrayOne) {
		Arrays.sort(arrayOne);
		return arrayOne[sizeOfArrayOne-2];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int sizeOfArrayOne=scanner.nextInt();
		int[] arrayOne= new int[sizeOfArrayOne];
		//int[] arrayTwo= new int[sizeOfArrayOne];
		boolean flag = true;
		if(sizeOfArrayOne<0) {
			System.out.println("invalid input");
		}else {
			System.out.println("enter the array elements");
			for(int i=0;i<sizeOfArrayOne;i++) {
				arrayOne[i]=scanner.nextInt();
				if(arrayOne[i]<0) {
					System.out.println("invlaid input");
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			int out=secondLargest(arrayOne,sizeOfArrayOne);
			System.out.println(out);
		}

	}

	

}
