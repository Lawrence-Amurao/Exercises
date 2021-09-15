package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonStartTest {

    @Test
    public void nonStart_pass_Hello_and_There_return_ellohere() {
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("Hello", "There");
        String expected = "ellohere";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nonStart_pass_java_and_code_return_ellohere() {
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("java", "code");
        String expected = "avaode";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nonStart_pass_shotl_and_java_return_hotlava() {
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("shotl", "java");
        String expected = "hotlava";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nonStart_pass_Vice_and_Sberg_return_iceberg() {
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("Vice", "Sberg");
        String expected = "iceberg";

        //Assert
        Assert.assertEquals(expected, actual);
    }

}