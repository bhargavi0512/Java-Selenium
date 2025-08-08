package com.banking.service;

public class BankApp {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Alice", 1000.0);
        Customer c2 = new Customer(102, "Bob", 500.0);

        BankService service = new BankServiceImp();

        service.openAccount(c1);
        service.openAccount(c2);

        service.showCustomer(101);
        service.showCustomer(102);

        service.deposit(101, 200.0);
        service.withdraw(102, 100.0);
        service.withdraw(102, 600.0); 
    }
}