package general;

class Account {
	public int balance;
}

class MyExcecption extends Exception {

	public MyExcecption(String msg) {
		super(msg);
	}
}

public class ExceptionHandeling {

	public static void main(String[] args) throws MyExcecption {

		// Creating 2 objects of class Account
		Account account1 = new Account();
		Account account2 = new Account();

		// Setting balance of an account account1 to 4000
		account1.balance = 4000;

		try {
			if (account1.balance < 5000) {
				throw new MyExcecption("Insufficient balance");
			} else {
				System.out.println("Transaction completed.!");
			}
		} catch (MyExcecption e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error while transaction");
		}
		// this block gets executed irrespective of throwing the exception
		finally {
			System.out.println("Thank you..!!");
		}

	}

}
