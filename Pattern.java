package assignment_june;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int a = 1;
			for(int j=0;j<=i;j++) {
				//System.out.print(a+" ");
				if(a==1) {
					System.out.print(a+"");
					a=0;
					}
				else {
					System.out.print(a+"");
					a=1;}
			}
			
			System.out.println();
		}
	
		System.out.println();
	
	int k=15;
	for(int i=1;i<=5;i++) {
		for(int j=5;j>0;j--) {
			System.out.print(k+" ");
			k--;
		}
		System.out.println();
	}

}
}
