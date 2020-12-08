package com.company;

public class SavingAccount extends Account{
    private double rate;

    public SavingAccount(String firstName, String lastName, Double balance, double rate) {
        super(firstName, lastName, balance);
        this.rate = rate;
    }


}