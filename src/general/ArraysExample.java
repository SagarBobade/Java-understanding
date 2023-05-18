package general;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//This is also a way of declaring arrays.
		int[] numbersArray1 = {2, 5, 6, 3, 5};
		int[] numbersArray2 = {2, 5, 6, 3, 5};
		int[] numbersArray3 = {1, 4, 2, 8, 3};

		System.out.print("numbersArray1: ");
		// Printing all elements of array- numbersArray1
		for(int i=0; i<numbersArray1.length; i++) {
			System.out.print(numbersArray1[i]+", ");						
		}
		System.out.println();

		// Printing all elements of array- numbersArray2
		System.out.print("numbersArray2: ");
		for(int i=0; i<numbersArray2.length; i++) {
			System.out.print(numbersArray2[i]+", ");						
		}
		System.out.println();
		
		// Printing all elements of array- numbersArray3
		System.out.print("numbersArray3: ");
		for(int i=0; i<numbersArray3.length; i++) {
			System.out.print(numbersArray3[i]+", ");						
		}
		System.out.println();
		

		// Accepting size of an array from user
		System.out.println("How many integers do you want in an array ?");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		
		
		// Accepting elements of an array from user
		System.out.println("Enter values of an array: ");
		for(int i=0; i<size; i++) {
			System.out.println("Enter number at "+(i+1)+" :");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("--------------");
		System.out.println("That's it, you've entered "+numbers.length+" elements");
		
		// Displaying all elements of an array 
		System.out.println("Priting values from an Array as it is.");
		for(int i=0; i<size; i++) {
			System.out.print("Number at "+(i+1)+" :");
			System.out.println(numbers[i]);			
		}
		System.out.println("--------------");
		
		// Clonning of an array
		System.out.println("Let's create clone of this array.");
		int[] clonnedNumbers = Arrays.copyOf(numbers, size);
		for(int i=0; i<size; i++) {
			System.out.print("Number at "+(i+1)+" :");
			System.out.println(clonnedNumbers[i]);			
		}
		
		//Checking if we have clonned correctly.
		if(Arrays.equals(numbers, clonnedNumbers)) {
			System.out.println("Yes, we have clonned array successfully..!");
		}
		else {
			System.out.println("Opps.. something went wrong.!");
		}
		
		System.out.println("Now let's sort our clonned array.");
		// Sorting an array
		Arrays.sort(clonnedNumbers, 0, size);
		for(int i=0; i<size; i++) {
			System.out.print("Number at "+(i+1)+" :");
			System.out.println(clonnedNumbers[i]);			
		}		

		System.out.println("Now, lets check if contents are equal for above delcared arrays.");
		// Checking if arrays are equal
		if(Arrays.equals(numbersArray1, numbersArray2)) {
			System.out.println("NumbersArray1 and NumbersArray2 are same");
		}
		else {
			System.out.println("NumbersArray1 and NumbersArray2 are NOT same");			
		}
		if(Arrays.equals(numbersArray1, numbersArray3)) {
			System.out.println("NumbersArray1 and NumbersArray3 are same");
		}
		else {
			System.out.println("NumbersArray1 and NumbersArray3 are NOT same");
		}

		//Checking if one of above the array has element 5
		int valueAtIndex = Arrays.binarySearch(numbersArray1, 5);
		if(valueAtIndex>=0) {
			System.out.println("value is at index: "+ valueAtIndex);
		}
		else {
			System.out.println("value not found in given array.");
		}
		
	}

}
