package com.aravindh;

import java.util.Scanner;

public class CalculateBonus {

	private static int calculateBonus(int input) {
		float bonus=0;
		float out=0;
		float per=0;
		if(input>20000) {
			per=(float)17/100;
			bonus=input*per;
			//System.out.println(bonus);
			out=bonus+1500;
		}else if(input>15000 && input<20000) {
			per=(float)15/100;
			bonus=input*per;
			//System.out.println(bonus);
			out=bonus+1200;
		}else if(input>10000 &&input<15000) {
			per=(float)12/100;
			bonus=input*per;
			//System.out.println(bonus);
			out=bonus+1000;
		}else {
			per=(float)8/100;
			bonus=input*per;
			//System.out.println(bonus);
			out=bonus+500;;
		}
		return (int) out;
	}
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		int input=scanner.nextInt();
		
		if(input<0) {
			System.out.println("number too small");
		}else if(input>32767) {
			System.out.println("number too big");
		}else {
			int out=calculateBonus(input);
			System.out.println(out);
		}

	}



}
