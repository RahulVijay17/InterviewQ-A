package com.aravindh;

import java.util.Scanner;

class UserMainCode{

	public int performArithmeticOperation(int input1, int input2, int input3) {
		int out=0;
		if(input1>32767||input2>32767) {
			out=-1;
		}else if(input3==1) {
			out=input1+input2;
		}else if(input3==2) {
			out=input1-input2;
		}else if(input3==3) {
			out=input1*input2;
		}else if(input3==4) {
			out=input1/input2;
		}else {
			out=-1;
		}
		return out;
	}
	
}
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode userMainCode = new UserMainCode();
		Scanner scanner = new Scanner(System.in);
		int input1=scanner.nextInt();
		int input2=scanner.nextInt();
		int input3=scanner.nextInt();
		
		if(input1<0||input2<0||input3<0) {
			System.out.println("invalid input");
		}else {
			int out=userMainCode.performArithmeticOperation(input1,input2,input3);
			if(out==-1) {
				System.out.println("invalid input");
			}else {
				System.out.println(out);
			}
		}
	}

}
