package day4.accessmodifier;

import day4.accessmodifier.financial.Balance;

public class Account {
    void displayBalance() {
        Balance balance = new Balance();
        balance.setAmount(1_000_000);

        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.displayBalance();
    }
}
