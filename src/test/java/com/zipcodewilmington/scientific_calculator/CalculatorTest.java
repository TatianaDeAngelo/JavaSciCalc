

package com.zipcodewilmington.scientific_calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest { //first brace

        @Test
        public void testSum () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 2;
        double num2 = 2;
        double expectedValue = 4;

        //When
        double actualValue = calculator.sum(num1, num2);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends sum

        @Test
        public void testSubtract () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 6;
        double num2 = 2;
        double expectedValue = 4;

        //When
        double actualValue = calculator.subtract(num1, num2);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends subtraction

        @Test
        public void testMultiplication () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 2;
        double num2 = 2;
        double expectedValue = 4;

        //When
        double actualValue = calculator.Multiplication(num1, num2);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends multiplication

        @Test
        public void testDivision () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 8;
        double num2 = 2;
        double expectedValue = 4;

        //When
        double actualValue = calculator.Division(num1, num2);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends division

        @Test
        public void testSquare () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 5;
        double expectedValue = 25;

        //When
        double actualValue = calculator.Square(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends square

        @Test
        public void testSquareRoot () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 16;
        double expectedValue = 4;

        //When
        double actualValue = calculator.SquareRoot(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends square root

        @Test
        public void testExponent () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 3;
        double num2 = 4;
        double expectedValue = 81;

        //When
        double actualValue = calculator.Exponent(num1, num2);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends exponent

        @Test
        public void testInverse () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 5;
        double expectedValue = 0.2;

        //When
        double actualValue = calculator.Inverse(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends Inverse

        @Test
        public void testSigns () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = -17;
        double expectedValue = 17;

        //When
        double actualValue = calculator.Signs(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends signs switch



    // I skipped 'Err' because I am not sure how to test for that rn
    // Skipping any portion of the calculator that is not a operation








} //final brace
//System.out.println(expectedValue); if needed to check if a portion is print the expected/actual or if wrong