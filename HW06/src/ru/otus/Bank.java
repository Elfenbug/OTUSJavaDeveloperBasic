package ru.otus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    Map<Account, Client> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void newAccount(String name, int balance, Client client) {
        accounts.put(new Account(name, balance, client), client);
    }

    public Client seekClient(String account) {
        for (Map.Entry<Account, Client> entry : accounts.entrySet()) {
            if (entry.getKey().getAccountName().equals(account)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public List<Account> seekAccount(Client client) {
        List<Account> findAccount = new ArrayList<>();
        for (Map.Entry<Account, Client> entry : accounts.entrySet()) {
            if (client.equals(entry.getValue())) {
                findAccount.add(entry.getKey());
            }
        }
        return findAccount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
