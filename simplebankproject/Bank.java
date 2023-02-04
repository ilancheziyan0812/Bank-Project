package com.simplebankproject;

public interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    String getBalance();
    String displayErrorMessage();
}
// All the method in interface are automatically public and abstract
