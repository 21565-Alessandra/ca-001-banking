package com.company;

import java.util.ArrayList;
import java.util.List;

public class BankingAction {
    private static List<Customer> customers = new ArrayList();

    public static void AddCustomer(Customer customer) {

        System.out.println("Creating " + customer.firstName);
        System.out.println("Creating " + customer.lastName);
        System.out.println("Creating " + customer.email);
        // you can add in all the other parameters for a customer

        FileManager.AddCustomerToFile(customer);

        String savingsFile,  currentFile;
        savingsFile =  GenerateAccountName( customer) + ".savings.txt";
        currentFile = GenerateAccountName( customer) + ".current.txt";

        FileManager.CreateCustomerAccount(savingsFile);
        FileManager.CreateCustomerAccount(currentFile);
        //Then you write the customer details out to the file

    }

    public static String GenerateAccountName(Customer customer) {
        /// up to you to write the overall logic
        String fullName = customer.firstName + customer.lastName;
        String firstCharFirstName = customer.firstName.substring(0,1);
        String firstCharLastName = customer.lastName.substring(0,1);

        int positionFirstName = alphabeticPosition(firstCharFirstName);
        int positionLastName = alphabeticPosition(firstCharLastName);
        return customer.firstName + customer.lastName + "-" + fullName.length()+"-"+positionFirstName+"-"+positionLastName;
    }

    public static int alphabeticPosition(String character){
        switch (character){
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
            case "D":
                return 4;
            case "E":
                return 5;
            case "F":
                return 6;
            case "G":
                return 7;
            case "H":
                return 8;
            case "I":
                return 9;
            case "J":
                return 10;
            case "K":
                return 11;
            case "L":
                return 12;
            case "M":
                return 13;
            case "N":
                return 14;
            case "O":
                return 15;
            case "P":
                return 16;
            case "Q":
                return 17;
            case "R":
                return 18;
            case "S":
                return 19;
            case "T":
                return 20;
            case "U":
                return 21;
            case "V":
                return 22;
            case "W":
                return 23;
            case "X":
                return 24;
            case "Y":
                return 25;
            case "Z":
                return 26;
            default:
                return 0;
        }
    }

    public static void DeleteCustomer(String accountNumber) {
        customers.removeIf(customer -> customer.getAccountNumber() == accountNumber);
    }

    public static void CreateTransaction(BankingTransaction transaction) {
        System.out.println("Creating Transaction......");
    }

    public static void ListCustomers() {
        for(Customer c: customers){
            c.getCustomer();
        }
    }

    public static void ListTransactionHistory() {

    }

    public static void Lodge() {

    }

    public static void Withdraw() {

    }
}
