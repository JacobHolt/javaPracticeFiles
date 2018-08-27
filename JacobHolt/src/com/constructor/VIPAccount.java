package com.constructor;

public class VIPAccount {
    private String accountName;
    private long creditLimit;
    private String emailAddress;

    public VIPAccount() {
        this("Default Name", 1000, "Default@email.com");
    }

    public VIPAccount(String accountName, long creditLimit){
        this(accountName, creditLimit, "Default@email.com");
    }

    public String getAccountName() {
        return accountName;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VIPAccount(String accountName, long creditLimit, String emailAddress) {
        this.accountName = accountName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }
}

