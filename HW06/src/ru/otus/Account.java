package ru.otus;

public class Account {
    private String accountName;
    private int banlance;
    private Client client;

    public Account(String accountName, int banlance, Client client) {
        this.accountName = accountName;
        this.banlance = banlance;
        this.client = client;
    }

    public String getAccountName() {
        return accountName;
    }

    public Client getClient() {
        return client;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", banlance=" + banlance +
                ", client=" + client +
                '}';
    }
}
