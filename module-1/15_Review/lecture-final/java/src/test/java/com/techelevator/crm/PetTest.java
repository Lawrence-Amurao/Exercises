package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void listVaccinations_with_one_vaccination() {
        // Arrange
        Pet pet = new Pet("Bob", "dog");
        List<String> vaccines = new ArrayList<>();
        vaccines.add("Distemper");
        pet.setVaccinations(vaccines);

        //Act
        String expected = "Distemper";
        String actual = pet.listVaccinations();

        //Assert
        Assert.assertEquals(expected, actual);
    }
}