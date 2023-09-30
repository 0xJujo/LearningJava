import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner arrlen= new Scanner (System.in);
		 
		System.out.println("Enter the length of the array: ");
		int n= arrlen.nextInt();
		
		int[] values = new int[n];
		
		System.out.println("Enter " +n+" values");
		
		
		for(int i=0; i<values.length; i++) {
			Scanner objectName= new Scanner (System.in);
			
			values[i]= objectName.nextInt();
			
		}
		for(int i=0; i<values.length; i++) {
			System.out.println("Entered Digit no. "+ i + " is: " + values[i]);
		
		}
}

}
