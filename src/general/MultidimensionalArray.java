package general;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rows in array ?");
		int rows = scanner.nextInt();
		
		System.out.println("How many columns in array ?");
		int columns = scanner.nextInt();

		
		int[][] arr = new int[rows][columns];

		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println("Enter value of row "+(i+1)+" and column "+(j+1));
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Representation is as -");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		// Using foreach loop for 2 dimensional array
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.println(is2);				
			}
		}
		
	}

}
