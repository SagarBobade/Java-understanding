package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Key-Value Pairs
 * Unique keys
 * No specific order
 */

public class MapExample {

	public static void main(String[] args) {

		// Creating object of Hashmap
		Map<String, Integer> Users = new HashMap<>();

		Users.put("Sam", 30);
		Users.put("Roy", 27);
		Users.put("Danny", 29);

		System.out.println(Users);
		
		// Get record by passing key
		int userAge = Users.get("Sam");
		System.out.println("Age of Sam is: " + userAge + " years old.");

		// Checking if given key contains in provided map
		if (Users.containsKey("Danny")) {
			System.out.println("Danny is present in Set");
		}
		else {
			System.out.println("Danny is NOT present is Set");
		}

		// Checking if given value contains in provided map
		if (Users.containsValue(45)) {
			System.out.println("SomeOne is 45 years old");
		}
		else {
			System.out.println("No one is 45 years old");
		}

		// Iterating all keys of provided map
		for (String userName : Users.keySet()) {
			System.out.println("Key: "+ userName);
		}

		// Iterating all values of provided map		
		for (int age : Users.values()) {
			System.out.println("Value: "+ age);
		}
		
		// Iterating all keys and values of provided map
		for (Entry<String, Integer> entry : Users.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// Removing a entry by providing key
		Users.remove("Sam");
		System.out.println(Users);
		
		System.out.println("Size of Users map is: "+Users.size());

		// Checking if Map is empty, if not then clear it
		if(!Users.isEmpty()) {
			Users.clear();
		}
	}

}
