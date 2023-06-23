package ru.netology.clients;


import ru.netology.accounts.Account;
import ru.netology.accounts.MoneyTarget;

public class Client implements MoneyTarget {

    protected String name;
    protected Account[] accounts;


    public Client(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
    }


    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для создания нового счёта нет!");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            if (accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    public void getAllBalances () {
        System.out.println("Cостояние Ваших счетов:");
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            } else {
                System.out.println(accounts[i].getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public boolean accept(long money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            if (accounts[i].add(money)) {
                return true;
            }
        }
        return false;
    }
}

