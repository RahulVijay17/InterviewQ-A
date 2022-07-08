package com.aravindh;

import java.util.Scanner;

public class LargestArray {
	
	public static int[] output = new int[100];
	
	private static void largestArray(int[] arrayOne, int[] arrayTwo, int sizeOfArrayOne) {

		for(int i=0;i<sizeOfArrayOne;i++){
		//	System.out.println(arrayOne[i]);
			//System.out.println(arrayTwo[i]);
			if(arrayOne[i]>arrayTwo[i]) {
				output[i]=arrayOne[i];
			}else if(arrayOne[i]==arrayTwo[i]) {
				output[i]=arrayOne[i];
			}else {
				output[i]=arrayTwo[i];
			}
		}

		for(int out:output) {
			if(out!=0) {
				System.out.println(out);
			}
		}
		
		
	}
			
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int sizeOfArrayOne=scanner.nextInt();
		int[] arrayOne= new int[sizeOfArrayOne];
		int[] arrayTwo= new int[sizeOfArrayOne];
		boolean flag = true;
		if(sizeOfArrayOne<0) {
			System.out.println("invalid input");
		}else {
			System.out.println("enter the first array elements");
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
			System.out.println("enter the second array elements");
			 for(int i=0;i<sizeOfArrayOne;i++) {
					arrayTwo[i]=scanner.nextInt();
					if(arrayTwo[i]<0) {
						System.out.println("invlaid input");
						break;
					}
				}
			
			 largestArray(arrayOne,arrayTwo,sizeOfArrayOne);
}

	
}
}