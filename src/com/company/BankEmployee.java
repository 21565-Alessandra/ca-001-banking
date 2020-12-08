package com.company;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BankEmployee {

    private String name;
    private String pin;

    private List<Customer> customers = new ArrayList();
    //Customer customer = new Customer();


    public BankEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    //here is to CREATE a password, not to validate whether it is right or wrong.
    public void setPin(String pin) {
        this.pin = pin;
    }

    public  void deleteCustomer(String accountNumber){
        //a collection was used that allows us to remove a customer based on his accountNumber
        //What means that if an user has the accountNumber equal to the provided accountNumber, he can delete the user
        //another condition is that the balance must be equal to 0, neither more nor less.
        customers.removeIf(customer -> customer.getAccount().getAccountNumber().equals(accountNumber) && customer.getAccount().getBalance() == 0.0);
    }

    public void createCustomer(String firstName, String lastName, String email, double balance){
        Customer customer = new Customer(firstName, lastName, email, balance);
        this.customers.add(customer);
    }

    //Here is possible to list customers and their balances
    public void listOfCustomers(){
        for(Customer customer:customers){
            System.out.println("Name:"+ customer.getFirstName()+ customer.getLastName());
            System.out.println("Balance: " + customer.getAccount().getBalance());
        }
    }

}