package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFashionTest {

    @Test
    public void dateFashion_pass_in_5_and_10_return_2() {
        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual= dateFashion.getATable(5, 10);
        int expected = 2;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dateFashion_pass_in_5_and_2_return_0() {
        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual= dateFashion.getATable(5, 2);
        int expected = 0;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dateFashion_pass_in_5_and_5_return_1() {
        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual= dateFashion.getATable(5, 5);
        int expected = 1;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dateFashion_pass_in_10_and_2_return_0() {
        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual= dateFashion.getATable(10, 2);
        int expected = 0;

        //Assert
        Assert.assertEquals(expected, actual);

    }




}