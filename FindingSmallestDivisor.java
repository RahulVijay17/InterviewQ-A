import java.util.Scanner;

public class FindingSmallestDivisor {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();
		 int out=secondSmallest(number);
		 if(out==-1) {
			 System.out.println("innvalid input");
		 }else
			 System.out.println(out);

	}

	private static int secondSmallest(int number) {
		int out=-1;
		if(number==1||number==2||number>32767) {
		out=number;
		}else {
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				if(i!=1) {
					out=i;
					break;
				}
			}
		}
		 
	}
		return out;
	}
}
