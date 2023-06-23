package ru.netology.accounts;

public abstract class Account implements MoneyTarget {

    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }


    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean accept(long money) {
        return add(money);
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

}
