package com.aravindh;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum=0;
//		int temp=num;
//		while(num>0) {
//			
//			int rem = num%10;
//			
//			sum = (sum*10)+rem;
//			
//			num=num/10;
//		}
//		
//		//System.out.println(temp);
//		if(temp==sum) {
//			System.out.println("its a palindrome");
//		}else {
//			System.out.println("not a palindrome");
//		}

		String str = "madam";
		// str.rev
		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		String str1 = stringBuffer.toString();
		if (str.equals(str1)) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("not");
		}
		String str3 = "";// m a d a m
							// m
							// m a
							// m a d
							// m a d a
							// m a d a m
		for (int i = (str.length() - 1); i >= 0; i--) {
			str3 += str1.charAt(i);
		}

		if (str1.equals(str3))
			System.out.println("palindrome");
		else
			System.out.println("not");

		char[] charArray = new char[str.length()];
		// m a d a m
		// m
		// m a
		// m a d
		// m a d a
		// m a d a m
		
		for (int i = (str.length() - 1),j=0; i >= 0; i--,j++) {
			
			//str3 += str1.charAt(i);
			     charArray[j]=str.charAt(i);
			     		//0=4
		}
		String str6=new String(charArray);

		if (str.equals(str6))
			System.out.println(" a palindrome");
		else
			System.out.println("not");

	}

}
