package mypackage;

abstract class Payment {
	  abstract void pay(double amount); 
	}
    class CreditCard extends Payment {
	    void pay(double amount) {
	        System.out.println(amount + " using Credit Card");
	    }
	}
    class UPI extends Payment {
	    void pay(double amount) {
	        System.out.println(amount + " using UPI");
	    }
	}



