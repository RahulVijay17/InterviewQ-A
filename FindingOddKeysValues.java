package assignment_june;

import java.util.Scanner;

public class FindingOddKeysValues {
	
	private static int avgOddKeyValues(int[] array, int size) {
		int output=0;
		int count=0;
		for(int i=0;i<size;i++) {
			if(i%2==0) {                         // 0 1 2 3
				if(array[i]%2!=0) {              //if that key is even the it will skip
				output+=array[i+1];
				count++;
			}
		}
		//System.out.println(output);
		 
	}
		return output/count;
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
			int out=avgOddKeyValues(array,size);
			System.out.println(out);
			}}

	
	}

	
}
