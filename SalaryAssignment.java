package com.aravindh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryAssignment {

	public static int calSalary(int salary, int shift) {
		double newSal;
		double add = shift * (salary * 2 / 100);
		System.out.println(add);
		newSal = salary + add;
		System.out.println(newSal);
		salary = (int) (newSal - (salary / 2));

		return salary;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

		int salary = Integer.parseInt(bufferReader.readLine());
		int shift = Integer.parseInt(bufferReader.readLine());

		if (salary > 80000) {
			System.out.println("salary too large");
		} else if (salary< 0) {
			System.out.println("salary too small");
		} else if (shift < 0) {
			System.out.println("shift too small");
		} else {
			System.out.println(calSalary(salary, shift));
		}

	}

}
