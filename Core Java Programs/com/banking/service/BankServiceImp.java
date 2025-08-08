package com.banking.service;

public class BankServiceImp implements BankService {
    private Customer[] customers = new Customer[10];
    private int count = 0;

    public void openAccount(Customer customer) {
        if (count < customers.length) {
            customers[count++] = customer;
        } else {
            System.out.println("Cannot open more accounts.");
        }
    }

    public void showCustomer(int customerId) {
        for (int i = 0; i < count; i++) {
            if (customers[i].getId() == customerId) {
                System.out.println("ID: " + customers[i].getId());
                System.out.println("Name: " + customers[i].getName());
                System.out.println("Balance: " + customers[i].getBalance());
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    public void deposit(int customerId, double amount) {
        for (int i = 0; i < count; i++) {
            if (customers[i].getId() == customerId) {
                double newBalance = customers[i].getBalance() + amount;
                customers[i].setBalance(newBalance);
                System.out.println("Amount deposited. New Balance: " + newBalance);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    public void withdraw(int customerId, double amount) {
        for (int i = 0; i < count; i++) {
            if (customers[i].getId() == customerId) {
                double balance = customers[i].getBalance();
                if (amount <= balance) {
                    customers[i].setBalance(balance - amount);
                    System.out.println("Amount withdrawn. New Balance: " + customers[i].getBalance());
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Customer not found.");
    }
}

