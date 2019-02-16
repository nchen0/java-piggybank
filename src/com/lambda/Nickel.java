package com.lambda;

public class Nickel implements Money {
    private double value = .05;
    private int number;

    public Nickel() {
        number = 1;
    }

    public Nickel(int number) {
        this.number = number;
    }

    public double getTotal() {
        return number * value;
    }

    public int getNumberOf() {
        return number;
    }

    public String getCoinName() {
        return "Nickel";
    }
}
