package assignment_june;

import java.util.Scanner;

public class GenerateNewNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input=scanner.nextInt();
		if(input>32767) {
			System.out.println("too big");
		}else if(input<0) {
			System.out.println("too small");
		}else {
			String out="";
			String len =Integer.toString(input);
			int adding=0;
			for(int i=0;i<len.length();i++) {
				int out1=0;
				out1=Integer.parseInt(len.valueOf(len.charAt(i)));
				//System.out.println(out1);
				adding=out1+2;
				//System.out.println(adding);
				out+=adding;
			}
			System.out.println(out);
		}

	}

}
