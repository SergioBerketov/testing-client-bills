package ru.netology.accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}
