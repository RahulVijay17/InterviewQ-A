package com.aravindh;

import java.util.Scanner;

public class FindCricketerd {
	
	public static int[] cricketer=new int[10];
	
	static void findCricketerId(int size, int[] array, int score) {
		int j=0;
		for(int i=0;i<size;i+=2) {
			if(array[i+1]>score) {
				cricketer[j]=array[i];
				j++;
//				System.out.println(cricketer[j]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int[] array = new int[size];
		if(size<0) {
			System.out.println("invalid array size");
		}else{
		System.out.println("enter the cricketer id and score");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			if (array[i] < 0) {
				System.out.println("invalid input");
				break;
			}
		}
		System.out.println("enter the score you want search");
		int score=scanner.nextInt();
		if(score>0) {
		findCricketerId(size,array,score);
		for(int output:cricketer) {
			if(output>0) {
				System.out.println(output);
			}
		}}else {
			System.out.println("invalid score");
		}
	
		}

		}
		
}
