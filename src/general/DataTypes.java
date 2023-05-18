package general;

public class DataTypes {

	public static void main(String[] args) {
		
		// Declaration and assignment of all types of datatypes in java
		int myInteger = 8;
		float myFloat = 3.21f;
		char myChar = 'a';
		boolean myBoolean = true;
		String myString = "Sagar";
		byte myByte = 100;
		short myShort = 5000;
		int myInt = 40000;
		long myLong = 9223372036854775800L;
		double myDouble = 4.3d;

		// Getting min value and max value of all types of datatypes in java
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;				
		byte minByte = Byte.MIN_VALUE;
	    byte maxByte = Byte.MAX_VALUE;
	    short minShort = Short.MIN_VALUE;
	    short maxShort = Short.MAX_VALUE;
	    int minInt = Integer.MIN_VALUE;
	    int maxInt = Integer.MAX_VALUE;
	    long minLong = Long.MIN_VALUE;
	    long maxLong = Long.MAX_VALUE;
	    float minFloat = Float.MIN_VALUE;
	    float maxFloat = Float.MAX_VALUE;
	
	    // Min and Max value of Float
		System.out.println("Min and Max value of the Float");
	    System.out.println(minFloat);
	    System.out.println(maxFloat);
	    System.out.println();
	    
	    // Min and Max value of Long
		System.out.println("Min and Max value of the Long");	    
	    System.out.println(minLong);
	    System.out.println(maxLong);
	    System.out.println();
	    
	    // Min and Max value of Byte
		System.out.println("Min and Max value of the Byte");
	    System.out.println(minByte);
	    System.out.println(maxByte);
	    System.out.println();
	      
	    // Min and Max value of Short
		System.out.println("Min and Max value of the Short");
	    System.out.println(minShort);
	    System.out.println(maxShort);
	    System.out.println();

	    // Min and Max value of Int
		System.out.println("Min and Max value of the Int");
	    System.out.println(minInt);
	    System.out.println(maxInt);
	    System.out.println();
	    
	    // Min and Max value of Double
	    System.out.println("Min and Max value of the Double");
	    System.out.println(minDouble);
	    System.out.println(maxDouble);
	    System.out.println();
	    
	    // Displaying values which we assigned above
	    System.out.println("Integer value: "+myInteger);
		System.out.println("Float value: "+myFloat);
		System.out.println("Char value: "+myChar);
		System.out.println("Boolean value: "+myBoolean);
		System.out.println("String value: "+myString);
	}

}
