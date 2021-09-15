package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    // Attributes
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    // Constructors needed
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //  getters (accessors) and setters (mutators)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String listVaccinations(){
 /*       String list = vaccinations.get(0);
        for (int i = 1; i < vaccinations.size(); i++){
            list += ", " + vaccinations.get(i);
        }*/
        String list = "";
            // String in the vaccinations List
        for (String vaccine: vaccinations){
            list += vaccine + ", ";
        }
        // remove the last 2 characters
        list = list.substring(0, list.length() - 2);

        return list;
    }
}
