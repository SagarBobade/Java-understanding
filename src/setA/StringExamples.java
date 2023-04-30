package setA;

public class StringExamples {

	public static void main(String[] args) {

		String displayString = "hey Java, How are you..!!";
		
		System.out.println("We have value: "+ displayString);
		System.err.println("Length of value is:"+ displayString.length());
		System.out.println("Check if its the same with 'hey Java, How are you..!!' "+ displayString.equals("hey Java, How are you..!!"));
		System.out.println("Check if its the same by ignoring case: "+ displayString.equalsIgnoreCase("HEY JAVA, HOW ARE YOU..!!"));
		System.out.println("Check if has 'Java' "+ displayString.contains("Java"));
		System.out.println("Check if has 'HEY' by ignoring case "+ displayString.contains("HEY".toLowerCase()));
		System.out.println("Check if it starts with 'hey "+ displayString.startsWith("hey"));
		System.out.println("Check if it ends with 'YOU..!! "+ displayString.endsWith("you..!!".toLowerCase()));
		System.out.println("Check at which index Java is: "+ displayString.indexOf("Java"));
		System.out.println("Replace letter 'Java' with 'JAVA' "+ displayString.replace("Java", "JAVA"));
		System.out.println("Get the substring from value: "+ displayString.substring(10, 15));
		System.out.println("Trim the value to use it further: "+ displayString.trim());
		
	}
}
