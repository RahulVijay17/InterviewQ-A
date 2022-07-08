package assignment_june;

import java.util.Scanner;

public class FindLCMByTwoNumbers {

	public static void main(String[] args) {
		 
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		if(num1>1000||num1<0){
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int num2=scanner.nextInt();
		if(num2>1000||num2<0){
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		int lcm=(num1>num2)?num1:num2;
		while(true){
			if(lcm%num1==0&&lcm%num2==0){
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
	

}