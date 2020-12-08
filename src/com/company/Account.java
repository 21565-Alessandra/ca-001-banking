package com.company;

public class Account {
    private String accountNumber;
    private double balance = 0.0;
    private String pin;

    public Account(String firstName, String lastName, Double balance) {
        this.accountNumber = createAccountNumber(firstName, lastName);
        this.balance = balance;
        this.pin = createPin(firstName, lastName);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public String createPin(String firstName, String lastName){
        String firstCharFirstName, firstCharLastName;
        int positionFirstName, positionLastName;

        firstCharFirstName = firstName.substring(0,1);
        firstCharLastName = lastName.substring(0,1);

        positionFirstName = alphabeticPosition(firstCharFirstName);
        positionLastName = alphabeticPosition(firstCharLastName);

        return positionFirstName+""+positionLastName;

    }

    public String createAccountNumber(String firstName, String lastName){
        String firstCharFirstName, firstCharLastName;
        int lengthFirstName, lengthLastName, positionFirstName, positionLastName, totalLength;

        firstCharFirstName = firstName.substring(0,1);
        firstCharLastName = lastName.substring(0,1);

        lengthFirstName = firstName.length();
        lengthLastName = lastName.length();
        totalLength = lengthFirstName + lengthLastName;

        positionFirstName = alphabeticPosition(firstCharFirstName);
        positionLastName = alphabeticPosition(firstCharLastName);

        return firstCharFirstName.toLowerCase() + firstCharLastName.toLowerCase() + "-" + totalLength + "-" + positionFirstName +"-"+ positionLastName;
    }

    public int alphabeticPosition(String character){
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

}