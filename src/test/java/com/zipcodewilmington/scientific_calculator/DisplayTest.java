package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest { //first brace
    @Test
    public void testError() {
        //Given
        Display display= new Display();
        String expected = "Error, not valid";

        //When
        display.displayError();
        String actual = display.getValue();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testClear() {
        //Given
        Display display = new Display();
        String expected = null;

        //When
        display.clear();
        String actual = display.getValue();

        //Then
        Assert.assertEquals(null, actual);
    }


} //ends DisplayTest
