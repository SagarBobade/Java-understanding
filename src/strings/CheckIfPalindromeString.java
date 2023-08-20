package strings;

import java.util.ArrayList;
import java.util.List;

public class CheckIfPalindromeString {

	static Boolean checkIfPalindrome(String name) {
		Boolean flag = true;
		// System.out.println(name.length());
		for (int i = name.length() - 1; i >= 0;) {
			for (int j = 0; j < name.length() - 1; j++) {
				System.out.println(name.charAt(i) + " : " + name.charAt(j));
				if (name.charAt(i) != name.charAt(j)) {
					flag = false;
					System.out.println(flag);
				}
					i--;
					if(i==-1) {
						break;
					}
			}
		}
		if (flag == false) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		if (checkIfPalindrome("racecar")) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is NOT palindrome");
		}

	}

}
