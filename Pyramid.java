package assignment_june;

public class Pyramid {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0;i<2*n;i++) {
			
			int col=i>n?2*n-i:i;
			
			int space = n-col;
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<col;z++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
