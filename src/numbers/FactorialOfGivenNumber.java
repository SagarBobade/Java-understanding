package numbers;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {

		int a = 10;
		int fact = 1;
		
		for(int i=a; i>1; i--) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
