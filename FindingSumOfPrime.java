package assignment_june;

import java.util.Scanner;

public class FindingSumOfPrime {
	private static int sumPrimeArray(int[] array, int size) {
		int output=0;
		int count=0;        
		for(int i=0;i<size;i++) {
			for(int j=1;j<=array[i];j++) {
				if(array[i]%j==0) {
					count++;
				}
				}
			if(count==2) {
				output+=array[i];
				count=0;
			}
			
		}
		if(output>0)
			return output;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int[] array= new int[size];
		boolean flag = true;
		if(size<0 && size>20) {
			System.out.println("invalid input");
		}else {
			System.out.println("enter the array elements");
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("invlaid input");
					flag=false;
					break;
				}
			}
			if(flag) {
			int out=sumPrimeArray(array,size);
			System.out.println(out);
			}}

	}

	

}
