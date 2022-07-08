package com.aravindh;

import java.util.Scanner;

public class SearchingKeysProgram {

	public static int[] storage = new int[100];
	private static void searchKeys(int[] array, int size, int value) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				continue;
			}else {
				if(array[i]==value) {
					storage[count]=array[i-1];
					count++;
				}
			}
		}
		for(int ele:storage) {
			if(ele==0) {
				continue;
			}else {
				System.out.println(ele);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=scanner.nextInt();
		int[] array = new int[size];
		if(size<0) {
			System.out.println("too small");
		}else {
			System.out.println("enter the elements in key and value format");
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if (array[i]<0) {
					System.out.println("invalid input");
					break;
				}
			}
		}
		System.out.println("enter the value u want to search");
		int value=scanner.nextInt();
		searchKeys(array,size,value);
	}

	
}
