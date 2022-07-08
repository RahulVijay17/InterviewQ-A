package assignment_june;

import java.util.Scanner;

public class PerfectSquareExample {
	
	private static int checkSquare(int number) {
		
		if(number<0) {
			return -1;
			
		}else {
			double out = Math.sqrt(number);
			//System.out.println(out);
		//	int com = (int) out;
		//	System.out.println(com);
			if(out==(int)out) {
				return 1;
			}else
				return 0;
		}
	
	}

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();
		int out = checkSquare(number);
		if(out==1) {
			System.out.println("perfect square");
		}else if(out==0) {
			System.out.println("not a perfect square");
		}else if(out==-1) {
			System.out.println("negative number");
		}
	}

	

}
