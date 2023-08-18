package numbers;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {

		Boolean flag = true;
		
		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number +" is Not a prime number");
				flag = false;
				break;
			}
		}

		if(flag == true) {
			System.out.println(number +" is a prime number");
		}
		
		scanner.close();

	}

}
