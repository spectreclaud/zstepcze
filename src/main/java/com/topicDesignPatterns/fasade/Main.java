package com.topicDesignPatterns.fasade;

public class Main {
    public static void main(String[] args) {

        AtmApi atmApi = new AtmApi();
        atmApi.deposit(300.0);
        atmApi.payOut(50.0);
        atmApi.transferMoney(150.0, "Konto Moje", "Konto Twoje");
        atmApi.recharge(20.0);
        atmApi.getLoan(1000.0);
    }
}
