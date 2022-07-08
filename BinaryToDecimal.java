package com.aravindh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryToDecimal {

	public static int convertToDecimal(int number) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		if(number>1111) {
			return -1;
		}else {
			number = Integer.parseInt(bufferedReader.readLine(),2);
			return number;
	}}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the binary number");
		String string = scanner.next();
		boolean flag=true;
		for (int i=0;i<string.length();i++) {
			System.out.println(string.charAt(i));
			if(string.charAt(i)!='1' ||string.charAt(i)!='0' ) {
				System.out.println("9");
				flag=false;
				break;
			}
		}
		int newone=Integer.parseInt(string);
		int out=0;
		if(flag)
			 out=convertToDecimal(newone);
		else
			System.out.println("invalid input");
		
		if(out==-1) {
			System.out.println("greater input");
		}else {
			System.out.println("decimal number is "+out);
		}
	}

}
