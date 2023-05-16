package collectionFramework;

import java.util.HashSet;
import java.util.Set;

/*
Set is an interface that extends the Collection interface
Unique elements
No Specific Order
*/
public class SetExample {

	public static void main(String[] args) {

		Set set = new HashSet<>();

		set.add("sagar");
		set.add(30);
		set.add(5.4);

		System.out.println(set);

		// Since sets don't have indexes, you can't directly access elements by index.
		for (Object object : set) {
			System.out.println(object);
		}

		// Sets do not provide a direct way to modify elements.
		// You need to remove the old element and add the new element.
		set.remove(30);
		System.out.println(set);

		set.add(200);
		System.out.println(set);

		int sizeOfSet = set.size();
		System.out.println("Size of set is: " + sizeOfSet);

		Boolean b = set.contains("sagar");
		if (b == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
