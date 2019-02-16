package com.lambda;

public class Dime implements Money {
    private double value = .1;
    private int number;

    public Dime () {
        number = 1;
    }

    public Dime(int number) {
        this.number = number;
    }

    public double getTotal() {
        return number * value;
    }

    public int getNumberOf() {
        return number;
    }

    public String getCoinName() {
        return "Dime";
    }
}
