package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Display {

    private String value;

    public void displayError() {
        Console.println("Error, not valid");
    }

    public String getValue() {
        return this.value;
    }

    public void clear() {
        Console.println("null");
    }
}
