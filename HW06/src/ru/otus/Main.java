package ru.otus;

public class Main {
    public static void main(String[] args) {
        Client vasya = new Client("Вася",18);
        Client masha = new Client("Маша",19);
        Bank bank = new Bank();

        bank.newAccount("new", 10, vasya);
        bank.newAccount("new2", 300, vasya);
        bank.newAccount("old", 10, masha);
        System.out.println(bank);
        System.out.println(bank.seekClient("new"));
        System.out.println(bank.seekClient("old"));
        System.out.println(bank.seekAccount(vasya));

    }
}
