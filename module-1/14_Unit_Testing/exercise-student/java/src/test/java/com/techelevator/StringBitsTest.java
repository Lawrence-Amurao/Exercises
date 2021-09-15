package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTest {

    @Test
    public void stringBits_pass_Hello_return_Hlo() {
        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Hello");
        String expected = "Hlo";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringBits_pass_Hi_return_H() {
        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Hi");
        String expected = "H";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringBits_pass_Heeololeo_return_Hello() {
        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Heeololeo");
        String expected = "Hello";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringBits_pass_Funny_return_Fny() {
        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Funny");
        String expected = "Fny";

        //Assert
        Assert.assertEquals(expected, actual);
    }

}