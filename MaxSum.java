package com.aravindh;

import java.util.Scanner;

public class MaxSum {
		static int sumOfEven(int[] array,int size)
		{
			int out=0;
			for(int i=0;i<size;i++)
			{
				if(array[i] %2==0)
				{
					out+=array[i];
				}
			}
			return out;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the size");
			int size=scanner.nextInt();
			int[] arr=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=scanner.nextInt();
			}
			if(size>0)
			{
				System.out.println("max is "+sumOfEven(arr,size));
			}
			else
			{
				System.out.println("Invalid Array Size");
			}
	
			
			

		}

	}

