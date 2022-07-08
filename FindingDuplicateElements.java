import java.util.Scanner;

public class FindingDuplicateElements {
	
	private static int[] output1 = new int[20];
	private static int output2=0;
	private static void eliminateDuplicate(int[] array, int size) {
		int j=0;
		for(int i=0;i<size-1;i++) {
			if(array[i]!=array[i+1]) {//1 2 1 2 3
				output1[j++]=array[i];
				 
			}
		}
		output1[j++] = array[size-1]; 
		 output2=j;
		 for(int i=0;i<output2;i++)
				 System.out.println(output1[i]);
			 
		 
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt(); 
		int array[]=new int[size]; 
		if(size < 0) {
			System.out.print("Invalid input");
			System.exit(0); 
			} else { 
				
				for(int i = 0; i< size; i++) {
					array[i] = scanner.nextInt(); 
					if(array[i] < 0) {
						System.out.print("Invalid input"); 
						System.exit(0); 
						}
					} 
		
	}
	 eliminateDuplicate(array,size);
	 

}


}
