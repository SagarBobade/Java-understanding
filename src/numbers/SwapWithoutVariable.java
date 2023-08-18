package numbers;

// Swap values of two variables without using third variable

public class SwapWithoutVariable {

	public static void main(String[] args) {

		int a = 11;
		int b = 21;
		
		a = b-a;
		b = b-a;
		a = a+b;

		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
	}

}
