package com.aravindh;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<0) {
			System.out.println("too small");
		}else if(num>32767) {
			System.out.println("too large");
		}else if(num==1){
			System.out.println("not");
		}
		else {
		boolean flag = true;
		while (num != 1) {
			if(num%2!=0) {
				flag=false;
				break;
			}
			num = num / 2;
		}

		if (flag)
			System.out.println("yes");
		else
			System.out.println("not");
	}

}}
