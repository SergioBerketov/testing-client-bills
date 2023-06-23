package ru.netology;


import ru.netology.accounts.Account;
import ru.netology.accounts.CheckingAccount;
import ru.netology.accounts.CreditAccount;
import ru.netology.accounts.SavingsAccount;
import ru.netology.clients.Client;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Victor", 4);

        Account checkingAccount = new CheckingAccount("Victor", 15_000);
        Account creditAccount = new CreditAccount("Victor", -10_000);
        Account savingsAccount = new SavingsAccount("Victor", 25_000, 5000);

        client.add(checkingAccount);
        client.add(creditAccount);
        client.add(savingsAccount);

        System.out.println(client.pay(500));
        System.out.println(client.pay(2_000_000));

        client.getAllBalances();
        client.accept(5000);
        client.getAllBalances();

        checkingAccount.transfer(savingsAccount, 700);
        client.getAllBalances();
    }
}