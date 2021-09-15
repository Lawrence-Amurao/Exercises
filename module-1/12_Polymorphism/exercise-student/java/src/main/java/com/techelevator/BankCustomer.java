package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public BankCustomer(String name, String address, String phoneNumber, List<Accountable> accounts) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    public BankCustomer() {

    }

    public void addAccount(Accountable newAccounts) {
        accounts.add(newAccounts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object[] getAccounts() {
        return accounts.toArray();
    }

    public boolean isVip() {
        int total = 0;

        for (Accountable eachAccount : accounts) {
            total = total + (eachAccount.getBalance());
        }
        if (total >= 25000) {
            return true;
        }
        System.out.println(total);
        return false;
    }

    @Override
    public int getBalance() {
        return 0;
    }

}
