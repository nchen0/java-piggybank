package com.lambda;

public class Dollar implements Money {
    private double value = 1.00;
    private int number;

    public Dollar () {
        number = 1;
    }

    public Dollar(int number) {
        this.number = number;
    }

    public double getTotal() {
        return number * value;
    }

    public int getNumberOf() {
        return number;
    }

    public String getCoinName() {
        return "$";
    }
}
