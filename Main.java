package com.answers;

import java.util.Scanner;

public class Main {

	static String createObject() {
		Scanner scanner = new Scanner(System.in);
		if(ImmutableExample.count<2) {
			new ImmutableExample(scanner.next(),scanner.nextInt());
			return "Object created";
		}else
			return "Object creation is not possible";
	}
	
	public static void main(String[] args) {
		
		
		 
	 
		System.out.println(createObject());
		System.out.println(createObject());
		System.out.println(createObject());
		 
	}
}
