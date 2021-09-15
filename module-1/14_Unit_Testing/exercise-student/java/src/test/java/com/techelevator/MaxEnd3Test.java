package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaxEnd3Test {

    @Test
    public void maxEnd3_pass_1_2_3_return_3_3_3() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] actual = maxEnd3.makeArray(new int []{1, 2, 3});
        int[] expected = new int[] {3, 3, 3};

        //Assert
        assertTrue(Arrays.equals(expected, actual));

    }

    @Test
    public void maxEnd3_pass_11_5_9_return_11_11_11() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] actual = maxEnd3.makeArray(new int[]{11, 5, 9});
        int[] expected = new int[]{11, 11, 11};

        //Assert
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void maxEnd3_pass_2_11_3_return_3_3_3() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] actual = maxEnd3.makeArray(new int[]{2, 11, 3});
        int[] expected = new int[]{3, 3, 3};

        //Assert
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void maxEnd3_pass_6_15_9_return_9_9_9() {
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] actual = maxEnd3.makeArray(new int[]{6, 15, 9});
        int[] expected = new int[]{9, 9, 9};

        //Assert
        assertTrue(Arrays.equals(expected, actual));
    }

}