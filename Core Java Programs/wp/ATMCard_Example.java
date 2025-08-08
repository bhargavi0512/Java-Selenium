package wp;
class ATMUser {
    private int accountNumber;
    private double balance;

    public ATMUser(int accNo, double bal) {
        this.accountNumber = accNo;
        this.balance = bal;
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0)
                throw new IllegalArgumentException("Amount must greater than 0");
            balance += amount;
            System.out.println("Amount deposited: ₹" + amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Deposit Done.");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0)
                throw new IllegalArgumentException("Amount must greater than 0");
            if (amount > balance)
                throw new RuntimeException("Insufficient Balance");
            balance -= amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal Done.");
        }
    }
}

public class ATMCard_Example {
    public static void main(String[] args) {
        ATMUser u1 = new ATMUser(1111, 5000);
      
        ATMUser u2 = new ATMUser(1112,3000);

        u1.checkBalance();             
        u1.deposit(2000);              
        u1.withdraw(1000);             
        u1.withdraw(8000);             
        u1.deposit(-500);             
        u1.withdraw(0);                
        u1.checkBalance(); 
        
        u2.checkBalance();
        u2.deposit(1000);
        u2.withdraw(500);
        u2.withdraw(6000);
        u2.deposit(-900);
        u2.withdraw(0);
        u2.checkBalance();
        
    }
}