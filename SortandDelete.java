package assignment_june;

import java.util.Arrays;
import java.util.Scanner;

public class SortandDelete {
	private static void sortAndDelete(int[] array, int size, int num) {
		Arrays.sort(array);
		int count=0;
		int[] output = new int[size];
		for(int i=0;i<size;i++) {
			if(num==array[i]) {
				
			}else
				output[count]=array[i];
			count++;
		}
		for(int out:output) {
			if(out!=0) {
				System.out.println(out);
			}
		}
		
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
		}
		System.out.println("enter the number do dlt");
		int num=scanner.nextInt();
		if(flag) {
			sortAndDelete(array,size,num);
			}

	}

	

}
