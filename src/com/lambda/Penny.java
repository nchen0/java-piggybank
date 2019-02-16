package com.lambda;

public class Penny implements Money {
    private double value = .01;
    private int number;

    public Penny () {
        number = 1;
    }

    public Penny(int number) {
        this.number = number;
    }

    public double getTotal() {
        return number * value;
    }

    public int getNumberOf() {
        return number;
    }

    public String getCoinName() {
        return "Penny";
    }
}
