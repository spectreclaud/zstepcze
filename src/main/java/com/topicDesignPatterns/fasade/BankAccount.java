package com.topicDesignPatterns.fasade;

public class BankAccount {

    public void deposit(double amount){
        System.out.println("BankAccount - deposit of amount: " + amount);
    }

    public void payOut(double amount){
        System.out.println("BankAccount - payOut of amount: " + amount);
    }
}
