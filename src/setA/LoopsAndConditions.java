package setA;

import java.util.Scanner;

public class LoopsAndConditions {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number from 1 to 10: ");
		int myNumber = scanner.nextInt();
		int attempts = 0;
		
		while(myNumber< 1 || myNumber>10) {
			attempts ++;
			if(attempts< 5) {
				System.out.println("Please enter number from defined range: ");
				myNumber = scanner.nextInt();
			}
			else {
				System.out.println("You have exhausted the attempts, please try again later.");
				System.exit(0);
			}
		}
		
		switch(myNumber) {
		case 1: 
		case 2: 
		case 3: 
			System.out.println("Number is too small");
			break;
		case 4: 
		case 5: 
		case 6: 
			System.out.println("Number is medium");
			break;
		case 7: 
		case 8: 
		case 9: 
		case 10: 		
			System.out.println("Number is large");
			break;
		}
		
		System.out.println("Lets check if number is even odd");
		if(myNumber%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		System.out.println("Lets count odd numbers from 0 to 10");
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
			
	
	}

}
