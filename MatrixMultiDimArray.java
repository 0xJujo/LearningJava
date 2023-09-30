import java.util.Scanner;

public class MatrixMultiDimArray {

	public static void main(String[] args) {
		int[][] arrName= {{3,4,5,2},{3,5,6,8,1,3},{1,3,5,6}};
		for(int i=0; i<arrName.length; i++){
			for(int j=0; j<arrName[i].length; j++) {
				System.out.print(arrName[i][j] + "  ");
			} 
			System.out.println();
		}
		int[][] strName= new int[2][2];
		for(int i=0; i<strName.length; i++){
			for(int j=0; j<strName[i].length; j++) {
				System.out.print("Enter 4 word matrix: ");
				Scanner input= new Scanner(System.in);
				int strName[i][j] = input.nextInt();
				
			} 
			System.out.println();
		}
	}

}
