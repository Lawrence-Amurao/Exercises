package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrontTimesTest {

    @Test
    public void frontTimes_pass_Chocolate_and_2_return_ChoCho() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual= frontTimes.generateString("Chocolate", 2);
        String expected = "ChoCho";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void frontTimes_pass_Chocolate_and_3_return_ChoChoCho() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual= frontTimes.generateString("Chocolate", 3);
        String expected = "ChoChoCho";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void frontTimes_pass_Abc_and_3_return_AbcAbcAbc() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual= frontTimes.generateString("Abc", 3);
        String expected = "AbcAbcAbc";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void frontTimes_pass_Iceberg_and_2_return_IceIce() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual= frontTimes.generateString("Iceberg", 2);
        String expected = "IceIce";

        //Assert
        Assert.assertEquals(expected, actual);

    }


}