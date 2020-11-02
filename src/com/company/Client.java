package com.company;

public class Client {
    String name;
    String surname;
    int loanAmount;
    boolean overDue;

    public Client() {

    }

    Client(String name, String surname, int loanAmount, boolean overDue){
        this.name = name;
        this.surname = surname;
        this.loanAmount = loanAmount;
        this.overDue = overDue;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
