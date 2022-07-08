package assignment_june;

import java.util.Scanner;

public class FindingCountOfResgisteredAccounts {
	
	private static int registerAccountNumbers(int size, int[] account_numbers, int branch_code) {
		int count=0;
		for(int i=0;i<size;i++) {
			//System.out.println(account_numbers[i]/branch_code);
			if(account_numbers[i]/branch_code==100) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int[] account_numbers= new int[size];
		boolean flag = true;
		if(size<0 && size<20) {
			System.out.println("invalid input");
		}else {
			System.out.println("enter the array elements");
			for(int i=0;i<size;i++) {
				account_numbers[i]=scanner.nextInt();
				if(account_numbers[i]<0) {
					System.out.println("invlaid input");
					flag=false;
					break;
				}
			}
			if(flag) {
			int branch_code=scanner.nextInt();
			int out=registerAccountNumbers(size,account_numbers,branch_code);
			System.out.println(out);
			}

	}

}
}

	