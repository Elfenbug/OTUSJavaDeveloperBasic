package ru.otus;

public class Client {
    private String clientName;
    private int age;

    public Client(String clientName, int age) {
        this.clientName = clientName;
        this.age = age;
    }

    @Override
    public String toString() {return "Client{" +
                "clientName='" + clientName + '\'' +
                ", age=" + age +
                '}';
    }
}