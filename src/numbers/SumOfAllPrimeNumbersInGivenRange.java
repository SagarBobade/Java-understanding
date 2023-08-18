package numbers;

public class SumOfAllPrimeNumbersInGivenRange {

	static Boolean isPrime(int number) {
		Boolean flag = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
			//	System.out.println(number + " is Not a prime number");
				flag = false;
				break;
			}
		}

		if (flag == true) {
			return true;
		}
		else {
			return false;
		}

	}

	public static void main(String[] args) {

		int sum =0;
		int start = 0;
		int end = 20;

		if(start == 0) {
			start= start=2;
		}
		if(end == 0) {
			end++;
		}
		
		for(int i = start; i< end; i++) {
			if(isPrime(i)) {
				System.out.println("prime number is: "+ i);
				sum = sum + i;
			}
		}
		
		System.out.println("Addition of all Prime numbers from "+start+" and "+end+" is = "+ sum);

	}

}
