package mypackage;

public class Payment_Main {
	    public static void main(String[] args) {
	        Payment p1 = new CreditCard();
	        Payment p2 = new UPI();

	        p1.pay(1500); 
	        p2.pay(500); 
	    }
}



