package ru.netology.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    Account creditAccount = new CreditAccount("Victor", -10_000);

    @Test
    void add() {

        long testBalanceAdd = 11000;
        Assertions.assertThrows(IllegalArgumentException.class, () -> creditAccount.add(testBalanceAdd));
    }
}