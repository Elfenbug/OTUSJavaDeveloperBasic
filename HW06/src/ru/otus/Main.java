package ru.otus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client vasya = new Client("Вася",18);
        Client masha = new Client("Маша",19);
        List<Account> accountVasya = new ArrayList<>();
        List<Account> accountMasha = new ArrayList<>();


        bank.newAccount(vasya,"new", 10);
        bank.newAccount(vasya,"new2", 300);
        bank.newAccount(masha,"old", 10);
        System.out.println("=========Список всех счетов с клиентами===========");
        System.out.println(bank);
        System.out.println("===========Поиск клиентов по клиенту===========");
        System.out.println(bank.seekClient("new"));
        System.out.println(bank.seekClient("old"));
        System.out.println("============Поиск счета по клиенту=============");
        System.out.println(bank.seekAccount(vasya));

    }
}
