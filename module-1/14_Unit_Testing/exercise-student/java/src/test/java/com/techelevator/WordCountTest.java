package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordCountTest {

    @Test
    public void wordCount_pass_baBaBlackSheep_211() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
       Map<String, Integer> actual = wordCount.getCount(new String[]{"ba", "ba", "black", "sheep"});
       Map<String, Integer> expected = new HashMap<>();
       expected.put("ba", 2);
       expected.put("black", 1);
       expected.put("sheep", 1);


        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCount_pass_abacb_return_221() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        Map<String, Integer> actual = wordCount.getCount(new String[]{"a", "b", "a", "c", "b"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);


        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCount_pass_cba_return_111() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        Map<String, Integer> actual = wordCount.getCount(new String[]{"c", "b", "a"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("c", 1);
        expected.put("b", 1);
        expected.put("a", 1);


        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCount_pass_wxwyxy_return_222() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        Map<String, Integer> actual = wordCount.getCount(new String[]{"w", "x", "w", "y", "x", "y"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("w", 2);
        expected.put("x", 2);
        expected.put("y", 2);


        //Assert
        Assert.assertEquals(expected, actual);
    }

}