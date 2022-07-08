package com.aravindh;

import java.util.Scanner;

public class GenerateCoupon {
	
	private static int generateCode(int coupon) {
		String out="";
		String output = "";
		while(coupon>0) {
			int res=coupon%10;
			if(res%2==0)
				out+=res;
			coupon=coupon/10;
		}
		if(out.length()==0)
			return 0;
		else
			for(int i=out.length()-1;i>=0;i--) {
				output+=out.charAt(i);
			}
			return Integer.parseInt(output);
	}
	static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int coupon=scanner.nextInt();
		
		if(coupon<0) {
			System.out.println("too small");
		}else if(coupon>32767) {
			System.out.println("too big");
		}else {
			int out = generateCode(coupon);
			System.out.println(out);
		}
	}



}
