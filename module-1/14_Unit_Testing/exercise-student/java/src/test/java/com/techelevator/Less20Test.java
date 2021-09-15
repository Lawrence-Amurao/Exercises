package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Less20Test {

    @Test
    public void less20_pass_18_return_true() {
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(18);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void less20_pass_19_return_true() {
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(19);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void less20_pass_20_return_false() {
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(20);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void less20_pass_17_return_false() {
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(17);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

}