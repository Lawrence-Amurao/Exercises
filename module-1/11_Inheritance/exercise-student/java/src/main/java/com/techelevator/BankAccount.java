package com.techelevator;

public class BankAccount {

    //properties -- Attributes
    private String accountHolderName;
    private String accountNumber;
    private int balance;



    // create constructors
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        this.balance += amountToDeposit;
        return this.balance;
    }

    public int withdraw(int amountToWithdraw) {
        this.balance -= amountToWithdraw;
        return this.balance;
    }

    public void transfer(BankAccount destinationAccount, int transferAmount) {
            this.withdraw(transferAmount);
            destinationAccount.deposit(transferAmount);
    }

    public BankAccount() {
        balance = 0;
    }


}
