package assignment_june;

import java.util.Scanner;

public class DailyAllowanceExample {
	
	private static int dailyAllowance(int[] array, int size) {
	 
		int[] price= {15,10,5};
		int out=0;
		for(int i=0;i<size;i++){
			out+=array[i]*price[i];
			
		}
		return out;
	}

	public static void main(String[] args) {
		 
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int array[]=new int[size];
		if(size>3){
			System.out.println("Array size greater than three");
			System.exit(0);
		}else if(size<=0){
			System.out.println("Invalid Input");
			System.exit(0);
		}else{
			for(int i=0;i<size;i++){
				array[i]=scanner.nextInt();
				if(array[i]<0){
					System.out.println("Invalid Item Count");
					System.exit(0);
				}
			}
			int out=dailyAllowance(array,size);
			System.out.println(out);
		}

	}

	
	

}