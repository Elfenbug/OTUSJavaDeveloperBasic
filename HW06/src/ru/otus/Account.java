package ru.otus;

public class Account {
    private String name;
    private int banlance;

    public Account(String accountName, int banlance) {
        this.name = accountName;
        this.banlance = banlance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + name + '\'' +
                ", banlance=" + banlance +
                '}';
    }
}
