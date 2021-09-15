package com.techelevator.tenmo.controller;

import com.techelevator.tenmo.dao.PuppyDAO;
import com.techelevator.tenmo.model.Puppy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    PuppyDAO dao;

    @RequestMapping(path="/all-puppies", method = RequestMethod.GET)
    public List<Puppy> getAllPuppies() {
        List<Puppy> allPuppies = dao.getPuppies();
        return allPuppies;
    }

}
