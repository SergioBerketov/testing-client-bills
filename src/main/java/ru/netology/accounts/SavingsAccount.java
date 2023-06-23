package ru.netology.accounts;

public class SavingsAccount extends Account {
    protected long minimalBalance;

    public SavingsAccount(String name, long balance, long minimalBalance) {
        super(name, balance);
        this.minimalBalance = minimalBalance;
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= minimalBalance) {
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
}







