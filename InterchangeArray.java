package assignment_june;

import java.util.Scanner;

public class InterchangeArray {

	public static void main(String[] args) { 
		int temp=0; // int flag=0; 
		Scanner scanner=new Scanner(System.in); 
		int size = scanner.nextInt(); 
		if(size < 0) {
			System.out.print("Invalid input");
			System.exit(0); 
			} else { 
				int array[]=new int[size]; 
				for(int i = 0; i< size; i++) {
					array[i] = scanner.nextInt(); 
					if(array[i] < 0) {
						System.out.print("Invalid input"); 
						System.exit(0); 
						}
					} 
				for(int i=0,j=size-1;i<size/2;i++,j--) { 
					temp = array[i]; 
					array[i] = array[j]; 
					array[j] = temp; 
					}
				for(int i=0;i<size;i++) 
					System.out.println(array[i]);
			}
		}

    


}