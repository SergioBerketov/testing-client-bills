package ru.netology.accounts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    Account checkingAccount = new CheckingAccount("Victor", 15_000);

    @ParameterizedTest
    @ValueSource(longs = {4000, 2000, 50000})
    void checking_balance_after_pay(long param) {

        checkingAccount.pay(param);
    }
}