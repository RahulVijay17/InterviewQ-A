package com.aravindh;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class Datett {
	public static void main(String[] args) throws ParseException {
		String date = "18-07-2020";
		String[] s =date.split("-");
		for(String e : s) {
			System.out.println(e);
		}
		System.out.println(s[2]);
	String a = s[2];
	int year = Integer.parseInt(a);
	System.out.println(year);
	}
}
