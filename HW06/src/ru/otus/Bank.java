package ru.otus;

import java.util.*;

public class Bank {
    private Map<Client, List<Account>> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void newAccount(Client client, String name, int balance) {
        if (!accounts.isEmpty() && accounts.get(client) != null) {
            List<Account> listAccount = new ArrayList<>(accounts.get(client));
            Account newAccount = new Account(name, balance);
            listAccount.add(newAccount);
            accounts.put(client, listAccount);
        } else {
            List<Account> newListAccounts = new ArrayList<>();
            newListAccounts.add(new Account(name, balance));
            accounts.put(client, newListAccounts);
        }
    }

    public Client seekClient(String name) {
        for (Map.Entry<Client, List<Account>> entry : accounts.entrySet()) {
            for(Account acc : entry.getValue()) {
                if(acc.getName().equals(name)) {
                    return  entry.getKey();
                }
            }
        }
        return null;
    }

    public List<Account> seekAccount(Client client) {
        return accounts.get(client);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
