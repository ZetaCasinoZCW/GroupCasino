package com.github.zipcodewilmington.casino;

import java.text.DecimalFormat;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    private final String accountName;
    private final String accountPassword;
    private double accountBalance = 0;

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public CasinoAccount(String name, String password) {
        this.accountName = name;
        this.accountPassword = password;
    }

    public CasinoAccount(String name, String password, double balance) {
        this.accountName = name;
        this.accountPassword = password;
        this.accountBalance = balance;
    }

    public CasinoAccount getAccount() {
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addMoneys(double money) {
        accountBalance += money;
    }

    public String printAccountBalance() {
        return moneyFormat.format(accountBalance);
    }

    public void cashOut() {
        accountBalance = 0.0;
    }
}
