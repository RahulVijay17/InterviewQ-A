package assignment_june;

import java.util.Scanner;

public class EndingWithThree {

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
			int count=0;
		 
		 for(int i=0;i<size;i++) {
			 
				 if(array[i]%10==3) {
					 count++;
			 }
		 }
		System.out.println(count);
		
}

	}

}
