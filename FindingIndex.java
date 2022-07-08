package assignment_june;

import java.util.Scanner;

public class FindingIndex {
	
	
	private static int findIndex(int[] array, int size, int searchElement) {
		int out=-1;
		for(int i=0;i<size;i++) {
			if(array[i]==searchElement)
				out=i;
		}
		return out;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=scanner.nextInt();
		int[] array = new int[size];
		//int compare=0;
		boolean flag=true;
		if(size<0||size>20) {
			System.out.println("OOPS! invalid input");
		}else {
			System.out.println("enter the elements");
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if (array[i]<0 ) {
					System.out.println("invalid input");
					flag=false;
					break;
				}
			}
		}
		if(flag) {
		System.out.println("enter the value u want to search");
		int searchElement = scanner.nextInt();
		int out = findIndex(array,size,searchElement);
		if(out==-1)
		System.out.println("not found");
		else 
			System.out.println(out);
		
		
}
		}
	
}