package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Interface extended from Collection interface
 * Elements in a List are ordered
 * A List allows duplicate elements
 * Elements in a List can be accessed using their index.
 */

public class ListExample {

	public static void main(String[] args) {

		// Object creation of ArrayList
		List<String> list = new ArrayList<>();

		// Append elements in list
		list.add("Google Chrome");
		list.add("Mozilla Firefox");
		list.add("Internet Explorer");

		System.out.println(list);

		System.out.println(list.get(0));

		// Remove element from list by providing element position
		list.remove(0);
		System.out.println(list);

		// Replace by new element to provided indexed element
		list.set(1, "duckduckgo");
		System.out.println(list);

		System.out.println("-------------------------------------------");

		list.add("Google Chrome");
		list.add("Internet Explorer");
		System.out.println(list);

		// Find size of list
		int sizeOfList = list.size();
		System.out.println("size of list is: " + sizeOfList);

		// Checking if list is not empty
		if (!list.isEmpty()) {
			// Iterating list using for loop
			for (int i = 0; i < sizeOfList; i++) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("-------------------------------------------");

		// Iterating list using an iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("-------------------------------------------");

		// Iterating list using foreach loop
		for (String element : list) {
			System.out.println(element);
		}
		
		list.clear();
		System.out.println(list);

	}

}
