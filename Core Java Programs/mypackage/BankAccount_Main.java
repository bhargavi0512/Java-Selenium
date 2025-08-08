package mypackage;

public class BankAccount_Main {
	    public static void main(String[] args) {
	        BankAccount acc = new BankAccount();

	        acc.setBalance(1000);
	        acc.deposit(500);
	        acc.withdraw(300);

	        System.out.println("Balance: " + acc.getBalance());
	    }
	}
