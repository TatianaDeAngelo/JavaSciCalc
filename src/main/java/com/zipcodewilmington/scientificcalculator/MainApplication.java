package com.zipcodewilmington.scientificcalculator;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = scanObject.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scanObject.nextInt();
        System.out.println("What operation? ");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+':
                answer = num1 + num2; //addition
                break;
            case '-':
                answer = num1 - num2; //subtraction
                break;
            case '*':
                answer = num1 * num2; //multiplication
                break;
            case '/':
                answer = num1 / num2; //division
                break;

        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);


        {
            double degrees = 45.0;

            // convert degrees to radians
            double radians = Math.toRadians(degrees);

            // sin() method to get the sine value
            double sinValue = Math.sin(radians);

            // prints the sine value
            System.out.println("sin(" + degrees + ") = " + sinValue);
        }
    }

}













