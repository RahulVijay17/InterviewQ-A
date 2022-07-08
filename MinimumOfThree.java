package assignment_june;

import java.util.Scanner;

public class MinimumOfThree {
	
	private static int findSmallest(int input1, int input2, int input3) {
		if(input1<input2&&input1<input3) {
			return input1;
		}else if(input2<input1&&input2<input3) {
			return input2;
		}else {
			return input3;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input1=scanner.nextInt();
		int input2=scanner.nextInt();
		int input3=scanner.nextInt();
		
		System.out.println(findSmallest(input1,input2,input3));
	}

	

}
