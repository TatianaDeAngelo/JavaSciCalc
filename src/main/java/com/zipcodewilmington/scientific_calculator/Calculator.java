package com.zipcodewilmington.scientific_calculator;

public class Calculator {
    public double sum(double num1 ,double num2) {
        double result;
        result = num1 + num2; //takes the sum of the two numbers
        return result;
    }

    public double subtract(double num1, double num2) {
        double result;
        result = num1 - num2; //takes the difference of the two numbers
        return result;
    }


    public double Multiplication(double num1, double num2) {
        double result;
        result = num1 * num2; //takes the product of the two numbers
        return result;
    }


    public double Division(double num1, double num2) {
        double result;
        result = num1 / num2; //takes the quotient of the two numbers
        return result;
    }

    public double Square(double num1) {
        double result;
        result = Math.pow(num1, 2); //squares num1
        return result;
    }


    public double SquareRoot(double num1) {
        double result;
        result = Math.sqrt(num1); //takes the square root of num1
        return result;
    }


    public double Exponent(double num1, double num2) {
        double result;
        result = Math.pow(num1, num2); // raises num1 to the num2 power ie 3^4=81
        return result;
    }


    public double Inverse(double num1) {
        double result;
        result = 1 / num1; // creates a reciprocal for num1
        return result;
    }


    public double Signs(double num1) {
        double result;
        result = -1 * num1; // switches the sign for the value of num1
        return result;
    }


    public double Sin(double num1) {
        double result;
        result = Math.sin(num1); // calculates the sine of num1 (in radians)
        return result;

    }


    public double Cos(double num1) {
        double result;
        result = Math.cos(num1); // calculates the cosine of num1 (in radians)
        return result;
    }


    public double Tan(double num1) {
        double result;
        result = Math.tan(num1); //calculates the sine/cosine of num1 (in radians)
        return result;
    }


    public double ArcSin(double num1) {
        double result;
        result = Math.asin(num1); //calculates the inverse sine of num1 (in radians)
        return result;
    }

    public double ArcCos(double num1) {
        double result;
        result = Math.acos(num1); //calculates the inverse cosine of num1 (in radians)
        return result;
    }


    public double ArcTan(double num1) {
        double result;
        result = Math.atan(num1); //calculates the inverse tangent of num1 (in radians)
        return result;
    }

    public double Logarithm(double num1) {
        double result;
        result = Math.log10(num1); //calculates log base 10 of num1
        return result;
    }

    public double InverseLog(double num1) {
        double result;
        result = Math.pow(10,num1); //calculates the 10 ^ x, where num1 is x
        return result;
    }

    public double NaturalLog(double num1) {
       double result;
        result = Math.log(num1); //calculates the natural log of num1
       return result;
    }

    public double InverseLn(double num1) {
        double result;
        result = Math.pow(Math.E,num1); //calculates e ^ x, where x is num1
        return result;
    }

    public static double factorial(double input) {
        double factorialFunction = 1.0;
        int i;
        for (i = 2; i <= input; i++) {
            factorialFunction += factorialFunction * (i - 1);
        }
        return factorialFunction;
    }

    public double AbsoluteValue(double num1) {
        double result;
        result = Math.abs(num1); //Absolute value, makes num1 positive, regardless of sign
        return result;
    }

    public double NthRoot(double num1, double num2, double num3) {
        double result;
        result = Math.pow(num1, (num2/num3)); //squares num1
        return result;
    }


    //public double Factorial(double num1) {
        //double result;
        //result = Math.
        //return result;

    //}


} // final brace



