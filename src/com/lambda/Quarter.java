package com.lambda;

public class Quarter implements Money {
    private double value = .25;
    private int number;

    public Quarter () {
        number = 1;
    }

    public Quarter(int number) {
        this.number = number;
    }

    public double getTotal() {
        return number * value;
    }

    public int getNumberOf() {
        return number;
    }

    public String getCoinName() {
        return "Quarter";
    }
}
