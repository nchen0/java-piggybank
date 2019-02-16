package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Piggybank piggybank = new Piggybank();
        piggybank.add(new Quarter());
        piggybank.add(new Dime());
        piggybank.add(new Dollar(5));
        piggybank.add(new Nickel(3));
        piggybank.add(new Dime(7));
        piggybank.add(new Dollar());
        piggybank.add(new Penny(10));
        piggybank.printContent();
    }
}
