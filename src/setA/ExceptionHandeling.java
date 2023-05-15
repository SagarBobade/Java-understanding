package setA;

class Account{
	public int balance;
}

class MyExcecption extends Exception{

	public MyExcecption(String msg) {
		super(msg);
	}
}

public class ExceptionHandeling {

	public static void main(String[] args) throws MyExcecption {

		Account account1 = new Account();
		Account account2 = new Account();
		
		account1.balance = 4000;
		try {		
		if(account1.balance < 5000) {
			throw new MyExcecption("Insufficient balance");
		}
		else {
			System.out.println("Transaction completed.!");
		}
		}
		catch (MyExcecption e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error while transaction");
		}
		finally {
			System.out.println("Thank you..!!");
		}
		
	}

}
