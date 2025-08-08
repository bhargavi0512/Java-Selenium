package mypackage;

class BankAccount {
	    private double balance;

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        }
	    }
	}