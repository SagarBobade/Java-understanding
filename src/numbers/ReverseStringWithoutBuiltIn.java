package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStringWithoutBuiltIn {

	public static void main(String[] args) {

		System.out.println("Enter a String to reverse");
		Scanner sc = new Scanner(System.in);
		
		String myString = sc.next();
		
		List<Character> charList = new ArrayList<>();

		for (char c : myString.toCharArray()) {
		//	System.out.println(c);
			charList.add(c);
		}

		for(int i=charList.size()-1; i>=0; i--) {
			System.out.print(charList.get(i));
		}
	}
}
