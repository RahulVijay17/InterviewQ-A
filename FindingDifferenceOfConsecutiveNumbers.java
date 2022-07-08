import java.util.Scanner;

public class FindingDifferenceOfConsecutiveNumbers {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt(); 

		if(number<0||number>32767) {
			System.out.println("invalid input");
			System.exit(0);
		}
		String a ="";
		while(number>0) {
			a+=number%10;
			number=number/10;
		}
		String b="";
		for(int i=(a.length()-1);i>=0;i--) {
			b+=a.charAt(i);
		}
		String c="";
		for(int i=0;i<b.length()-1;i++) {
			if(b.charAt(i)>b.charAt(i+1)) {
				int d =b.charAt(i)-b.charAt(i+1);
				c+=d;
			}else {
				int d =b.charAt(i+1)-b.charAt(i);
				c+=d;
			}
		}
		
		System.out.println( c);
	}

}
