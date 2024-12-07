package com.topicDesignPatterns.fasade;

public class Transfer {

    public void transferMoney(double amount, String fromAccount, String toAccount){
        System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount);
    }
}
