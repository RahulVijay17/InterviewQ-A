package com.aravindh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {

	class Sum{

		public static int total(int[] array) {
			// TODO Auto-generated method stub
			int output=0;
//			for (int i=0;i<array.length;i++) {
//				output+=array[i];
//			}
			for(int value : array) {
				output+=value;
			}
			return output;
		}
		public static int getTotal(List<Integer> lisst) {
			// TODO Auto-generated method stub
			int output=0;
//			for (int i=0;i<array.length;i++) {
//				output+=array[i];
//			}
			for(int value : lisst) {
				output+=value;
			}
			return output;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element you want to give as input");
		int count=sc.nextInt();
		//int[] array=new int[count];
		
		List<Integer> list = new ArrayList<>(count);
		
		for (int i=0;i<count;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("the sum is "+Sum.getTotal(list));
	}

}
