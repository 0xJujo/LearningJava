import java.util.Scanner;

public class Dowhile {

	
		Scanner object= new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		float num= object.nextFloat();
		
		 do {
			System.out.println("Enter a number: ");
			num= object.nextFloat();
			
		}while (num!=5);
	

}
