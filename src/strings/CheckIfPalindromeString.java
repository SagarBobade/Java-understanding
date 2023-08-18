package strings;

import java.util.ArrayList;
import java.util.List;

public class CheckIfPalindromeString {

	Boolean checkIfPalindrome(String name) {

		List<Character> reversedString = new ArrayList<>();
		List<Character> charList = new ArrayList<>();

		for (char c : name.toCharArray()) {
			System.out.println(c);
			charList.add(c);
		}

		System.out.println(charList.size());
		for (int i = charList.size() - 1; i >= 0; i--) {
			reversedString.add(charList.get(i));
		}

		StringBuilder sb = new StringBuilder();
		for (String element : reversedString) {
			sb.append(element).append(" ");
		}
		
        String result = sb.toString().trim();
        
        System.out.println(result);

	}

	public static void main(String[] args) {
		
		checkIfPalindrome("Ankush")

	}

}
