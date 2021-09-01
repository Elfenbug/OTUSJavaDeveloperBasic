package ru.otus;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void newAccount(String name,int banlance, Client client){
        accounts.add(new Account(name,banlance, client));
    }

    public Client seekClient(String accountName) {
        for (Account account : accounts) {
            if (accountName.equals(account.getAccountName())) {
                return account.getClient();
            }
        }
        return null;
    }

    public List<Account> seekAccount(Client client) {
        List<Account> findAccount = new ArrayList<>();
        for (Account account : accounts) {
            if (client.equals(account.getClient())) {
                findAccount.add(account);
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
