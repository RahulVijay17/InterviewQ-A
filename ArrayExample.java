import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5};

		Arrays.sort(array);
		
		int min=array[0];
		
		int max=array[4];
		
		int sum = min+max;
		
	
		System.out.println(min + " " +max+" "+sum);
		
		String message = "AravInDha Raj";
		String[] sarray = message.split(" ");
		System.out.println(message.toUpperCase());
//		for(String a:sarray) {
//			System.out.println(a);
//		}
		String one ="";
		String two="";
		String three="";
		String four="";
		for(int a=0;a<sarray.length;a++) {
		for(int i=0;i<sarray[a].length();i++) {
			//System.out.println(sarray[0]);
			 char ch = sarray[0].charAt(i);
			 if(i==0) {
				 if(Character.isUpperCase(ch)) {
					 System.out.println("1");
					 System.out.println(ch);
					 one+=ch;
				 }else {
					 Character.toUpperCase(ch);
				     System.out.println(ch);
			 		one+=ch;
			 }}else {
				 if(Character.isUpperCase(ch)) {
					 one+=Character.toLowerCase(ch);
				 }else
					 one+=ch;
			 }
		}
		}
		System.out.println(one+ " " +two);
	}
	
	
	

}
