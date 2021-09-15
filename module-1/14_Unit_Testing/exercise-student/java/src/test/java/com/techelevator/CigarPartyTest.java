package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CigarPartyTest {

    @Test
    public void cigarParty_pass_in_45_not_weekend_return_true() {
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual= cigarParty.haveParty(40, false);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void cigarParty_pass_in_70_is_weekend_return_true() {
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual= cigarParty.haveParty(70, true);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void cigarParty_pass_in_30_not_weekend_return_false() {
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual= cigarParty.haveParty(30, false);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void cigarParty_pass_in_61_not_weekend_return_false() {
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual= cigarParty.haveParty(61, false);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);

    }

}