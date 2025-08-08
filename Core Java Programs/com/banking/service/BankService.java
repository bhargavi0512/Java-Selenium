package com.banking.service;

public interface BankService {
    void openAccount(Customer customer);
    void showCustomer(int customerId);
    void deposit(int customerId, double amount);
    void withdraw(int customerId, double amount);
}	


