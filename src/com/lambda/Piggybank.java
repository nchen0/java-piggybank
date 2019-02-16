package com.lambda;

import java.util.ArrayList;

public class Piggybank {
    private double amount;
    private ArrayList<Money> bank = new ArrayList<>();

    public Piggybank() {
        this.amount = 0;
    }

    public void add (Money total) {
        this.amount += total.getTotal();
        this.bank.add(total);
    }

    public void printContent () {
        for (Money money : bank) {
            System.out.println(money.getNumberOf() + " " + money.getCoinName());
        }
    }
}
