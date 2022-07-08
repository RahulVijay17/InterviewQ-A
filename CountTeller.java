package com.aravindh;
import java.util.Arrays;
import java.util.Scanner;

public class CountTeller {

	private static int countRepeater(int size, int[] array) {
		// TODO Auto-generated method stub
		int count=1;
		// List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			//Arrays.sort(array);
			for (int j = i+1; j < size;) {
				if (array[i] == array[j]) {
					count++;
					for(int k=j;k<size-1;k++) 
						array[k] = array[k+1];
						size--;
						
				}else
					j++;
					

			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		if (size < 0) {
			System.out.println("invalid input");
		} else {

			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("invalid input");
				}
			}
//			for(int e:array) {
//				System.out.println(e);
//			}
		}
		System.out.println("The repeated salary count is " + CountTeller.countRepeater(size, array));
	}

}
