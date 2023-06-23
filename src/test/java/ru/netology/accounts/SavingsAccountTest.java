package ru.netology.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    Account savingsAccount = new SavingsAccount("Victor", 25_000, 5000);

    @Test
    void pay() {

        long testPay = 3000;

        boolean expected = false;

        long param1 = savingsAccount.balance - testPay;

        if(param1 >= 0) {
            expected = true;
        }

        boolean actual = savingsAccount.pay(testPay);

        Assertions.assertEquals(expected, actual);
    }
}