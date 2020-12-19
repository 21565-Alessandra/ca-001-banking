// STUDENT NAME: Alessandra Silva dos Reis * ID: 21565

package com.company;

public class Customer {

    public String firstName;
    public String lastName;
    public String email;
    private String accountNumber;

    public Customer(String _firstName, String _lastName, String _email) {
        firstName = _firstName;
        lastName = _lastName;
        email = _email;
    }

    public String getCustomer(){
        return firstName + " - " + lastName + " - "+ email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}