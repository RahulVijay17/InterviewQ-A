package assignment_june;

import java.util.Arrays;
import java.util.Scanner;

public class FindingProductOfMaxAndMin {
	
	private static int productOfMaxMin(int[] array, int size) {
		Arrays.sort(array);
		
		return array[0]*array[size-1];
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
			int out=productOfMaxMin(array,size);
			System.out.println(out);
			}

	
	}


	}

}
