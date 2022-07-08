package com.aravindh;

import java.util.Scanner;

public class SumOfPrime {
	public static int sumPrime(int[] array, int size) {
		int out=0;
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=1;j<=array[i];j++) {
			if(array[i]%j==0) {
			     count++;
			     
			}
		}
			if(count==2) {
				out+=array[i];
			}
			count=0;
			}
		return out;
	}
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			if(array[i]<0) {
				System.out.println("invalid input");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(sumPrime(array,size));
		}
	}

}
