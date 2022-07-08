package com.aravindh;

import java.util.Scanner;

public class ProductOfDigit {

		static int productOfDigits(int input)
		{
			int out = 1;
			while(input>0)
			{
				int remainder=input%10;
				out *= remainder;
				input=input/10;
			}
			return out;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			int input=scanner.nextInt();
			if(input >= 0)
			{
				System.out.println("product of digit is"+productOfDigits(input));
			}else
			{
				System.out.println("Invalid Input");
			}
		
		}

	}

