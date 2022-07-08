package com.aravindh;

import java.util.Scanner;

public class RollNoAndMark {
	private static int passCount(int[] array, int size) {
		int count=0;
		int passMark=70;//same or greater than 70
		for(int i=0;i<size;i++) {
			if(i%2!=0) {
				if(array[i]>=passMark) {
					count++;
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=scanner.nextInt();
		int[] array = new int[size];
		boolean flag=true;
		if(size<0||size%2!=0) {
			System.out.println("too small");
		}else {
			//System.out.println("enter the roll no and marks in key and value format");
			for(int i=0;i<size;i++) {
		
				if(i%2==0) {
					System.out.println("enter the roll no");
				}else {
					System.out.println("enter the marks");
				}
				array[i]=scanner.nextInt();
				if (array[i]<0) {
					System.out.println("invalid input");
					//flag=false;
					break;
				}
			}
			if(flag) {
				int output=passCount(array,size);
				System.out.println("passed student count is "+output);
			}

	}
		
}

	
}
