package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {

    // LION HAS THE WRONG GROUP NAME (HERD INSTEAD OF PRIDE) AND WILL CAUSE AN ERROR

    @Test
    public void animalGroupName_pass_in_animal_and_returns_group_name() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("pigeon");
        String expected = "Kit";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void animalGroupName_pass_in_blank_and_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("");
        String expected = "unknown";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void animalGroupName_pass_in_animal_not_in_list_and_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("chicken");
        String expected = "unknown";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void animalGroupName_pass_in_animal_in_caps_and_returns_group_name() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("pIgeoN");
        String expected = "Kit";

        //Assert
        Assert.assertEquals(expected, actual);

        // LION HAS THE WRONG GROUP NAME (HERD INSTEAD OF PRIDE) AND WILL CAUSE AN ERROR

    }

}