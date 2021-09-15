package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lucky13Test {

    @Test
    public void lucky13_pass_0_2_4_return_true() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{0, 2, 4});
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lucky13_pass_1_2_3_return_false() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{1, 2, 3});
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lucky13_pass_1_2_4_return_false() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{1, 2, 4});
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lucky13_pass_4_6_8_return_true() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{4, 6, 8});
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

}