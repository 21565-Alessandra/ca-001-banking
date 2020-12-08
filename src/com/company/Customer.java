package com.company;

import com.sun.istack.internal.Nullable;

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;
    private String email;


    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.account = new Account(firstName, lastName, balance);
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
