package com.aravindh;

import java.util.Scanner;

public class MultiplesOfTen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		if (N>=2 && N<=20) {
			for (int i=1;i<11;i++) {
				System.out.println(N+"X"+i+"="+N*i);
			}
			
		}else {
			System.out.println("please enter the number in between 2-20 inclusive");
		}
	}
}
