package com.company;

public class BankingTransaction {

    import java.util.ArrayList;
import java.util.List;

    public abstract class BankingTransaction {
        private double balance = 0.0;
        private Customer customer;
        private List<String> history = new ArrayList();

        public BankingTransaction(double balance, Customer customer) {
            this.balance = balance;
            this.customer = customer;
        }

        public BankingTransaction() {
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public List<String> getHistory() {
            return history;
        }

        public void setHistory(List<String> history) {
            this.history = history;
        }
    }

}
