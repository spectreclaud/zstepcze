package com.topicDesignPatterns.fasade;

public class AtmApi {
    private final BankAccount bankAccount;
    private final Transfer transfer;
    private final PhoneCard phoneCard;
    private final Loan loan;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
        this.loan = new Loan();
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    public void payOut(double amount) {
        bankAccount.payOut(amount);
    }

    public void transferMoney(double amount, String fromAccount, String toAccount) {
        transfer.transferMoney(amount, fromAccount, toAccount);
    }

    public void recharge(double amount) {
        phoneCard.recharge(amount);
    }

    public void getLoan(double amount) {
        loan.getLoan(amount);
    }
}
