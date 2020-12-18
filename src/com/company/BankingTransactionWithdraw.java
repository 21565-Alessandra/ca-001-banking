package com.company;

public class BankingTransactionWithdraw extends BankingTransaction{
    public BankingTransactionWithdraw(double balance, Customer customer) {
        super(balance, customer);
    }

    public BankingTransactionWithdraw() {
        super();
    }

    public void addHistory(String info){
        getHistory().add(info);
    }

}

}
