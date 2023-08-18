package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithoutBuiltIn {

	public static void main(String[] args) {

		String name = "Ankush";
		List<Character> charList = new ArrayList<>();

		for (char c : name.toCharArray()) {
			System.out.println(c);
			charList.add(c);
		}

		System.out.println(charList.size());
		for(int i=charList.size()-1; i>=0; i--) {
			System.out.print(charList.get(i));
		}
	}
}
