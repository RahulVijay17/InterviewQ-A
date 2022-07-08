package com.aravindh;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstLargest {

	

	private static int findFirstLargest(int[] arrayOne, int size) {
		Arrays.sort(arrayOne);
		int array[] = new int[size];
		int count=0;
		for(int i=size-1;i>=0;i--) {
			array[count]=arrayOne[i];
			count++;
		}
		return array[0]*array[2];
	}
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int sizeOfArrayOne=scanner.nextInt();
		int[] arrayOne= new int[sizeOfArrayOne];
		//int[] arrayTwo= new int[sizeOfArrayOne];
		boolean flag = true;
		if(sizeOfArrayOne<0 && sizeOfArrayOne<2) {
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
			int out=findFirstLargest(arrayOne,sizeOfArrayOne);
			System.out.println(out);
		}
	}

}
