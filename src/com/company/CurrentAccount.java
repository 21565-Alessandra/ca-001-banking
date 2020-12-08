package com.company;

public class CurrentAccount extends Account{
    public CurrentAccount(String firstName, String lastName, Double balance) {
        super(firstName, lastName, balance);
    }

    public void deposit(double value){
        double balance = getBalance();
        if(balance < value){
            System.out.println("Amount cannot be greater than balance");
        }else{
            balance = balance - value;
            //link to which account we want to deposit

        }

    }
}
