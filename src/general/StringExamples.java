package general;

/*
 * length()
 * equals() returns Boolean
 * equalsIgnoreCase("OtherString")
 * contains("OtherString")
 * toLowerCase()
 * startsWith("OtherString")
 * endsWith("OtherString")
 * indexOf("OtherString")
 * charAt(index)
 * replace("originalString", "newString")
 * substring(startIndex, endIndex)
 * trim()
 * concat(otherString)
 * compareTo(otherString) returns non zero value if not equal
 * compareToIgnoreCase(otherString) returns non zero value if not equal
 * lastIndexOf(String)
 * join(operator,stringArgs)
 */

public class StringExamples {

	public static void main(String[] args) {

		String myString = "hey Java, How are you..!!";
		
		System.out.println("We have value: "+ myString);
		System.err.println("Length of value is:"+ myString.length());
		System.out.println("Check if its the same with 'hey Java, How are you..!!' "+ myString.equals("hey Java, How are you..!!"));
		System.out.println("Check if its the same by ignoring case: "+ myString.equalsIgnoreCase("HEY JAVA, HOW ARE YOU..!!"));
		System.out.println("Check if has 'Java' "+ myString.contains("Java"));
		System.out.println("Check if has 'HEY' by ignoring case "+ myString.contains("HEY".toLowerCase()));
		System.out.println("Check if it starts with 'hey "+ myString.startsWith("hey"));
		System.out.println("Check if it ends with 'YOU..!! "+ myString.endsWith("you..!!".toLowerCase()));
		System.out.println("Check at which index Java is: "+ myString.indexOf("Java"));
		System.out.println("Check which character is at particular index: "+ myString.charAt(4));
		System.out.println("Replace letter 'Java' with 'JAVA' "+ myString.replace("Java", "JAVA"));
		System.out.println("Get the substring from value: "+ myString.substring(10, 15));
		System.out.println("Trim the value to use it further: "+ myString.trim());		
		System.out.println("Concat this string with "+ myString.concat(myString));
		System.out.println("Compares two string "+ myString.compareTo("hey Java, How are you..!!"));
		System.out.println("Compares two string ignoring case "+ myString.compareToIgnoreCase("hEY JAVA, How are you..!!"));
		System.out.println("Last occurance of string "+ myString.lastIndexOf("w"));
		System.out.println(" "+String.join("-", "my", "joined", "sentence"));
	}
}
