import java.util.Arrays;
import java.util.Scanner;

public class FindingDifference {
	
	private static int secondMinMaxDiff(int[] array, int size) {
		Arrays.sort(array);
		
		return array[size-2]-array[1];
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
		int out = secondMinMaxDiff(array,size);
		System.out.println(out);

}

	
}
