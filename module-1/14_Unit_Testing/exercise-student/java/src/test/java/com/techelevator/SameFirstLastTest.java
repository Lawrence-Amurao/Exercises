package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SameFirstLastTest {

    @Test
    public void sameFirstAndLast_pass_123_return_false() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        boolean actual = sameFirstLast.isItTheSame(new int[] {1, 2, 3});
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sameFirstAndLast_pass_1231_return_true() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        boolean actual = sameFirstLast.isItTheSame(new int[]{1, 2, 3, 1});
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sameFirstAndLast_pass_121_return_true() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        boolean actual = sameFirstLast.isItTheSame(new int[]{1, 2, 1});
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sameFirstAndLast_pass_empty_return_false() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        boolean actual = sameFirstLast.isItTheSame(new int[]{});
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);
    }

}