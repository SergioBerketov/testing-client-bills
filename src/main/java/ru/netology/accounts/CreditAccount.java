package ru.netology.accounts;

public class CreditAccount extends Account {

    public CreditAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        } else {
            throw new IllegalArgumentException("Кредитный счёт не может быть положительным!");
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount < 1_000_000) {  // кредитный лимит
            balance -= amount;
            return true;
        }else {
           return false;
        }
    }
}

