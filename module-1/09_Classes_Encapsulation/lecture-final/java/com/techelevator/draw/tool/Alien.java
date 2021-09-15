package com.techelevator.draw.tool;


// a class is a blueprint that describes all Aliens
public class Alien {
    // define data members, data variables, fields, instance variables, class variables
    // always private access!
    // these variables hold the state of an object
    private String color;
    private boolean isFriendly;
    private String planetOfOrigin;
    private String language;
    private int numberOfAppendages;
    private static int count;

    // constructor is always named the same as the class
    // and does not have a return data type
    // shorthand way to 'set' all the member fields for an object
    public Alien(String color, boolean isFriendly, String planetOfOrigin,
                 String language, int numberOfAppendages){
        this.color = color;
        this.isFriendly = isFriendly;
        this.planetOfOrigin = planetOfOrigin;
        this.language = language;
        this.numberOfAppendages = numberOfAppendages;
    }

    // default constructor!
    public Alien(){

    }

    // create methods that define the behaviors -- getters and setters
    // methods we can call outside of this class so access is public
    public void setColor(String color){
        this.color = color;
    }

    // setter will always return the data type of the class variable
    public String getColor(){
        return this.color;  // this is optional in this method
    }

    public void setIsFriendly(boolean isFriendly){
        this.isFriendly = isFriendly;
    }

    public boolean isFriendly(){
        return this.isFriendly;
    }

    // setters 'set' the value of the field for us
    public void setPlanetOfOrigin(String planetOfOrigin){
        this.planetOfOrigin = planetOfOrigin;
    }
    // getters 'get' or return the value of the field for us
    public String getPlanetOfOrigin(){
        return this.planetOfOrigin;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfAppendages() {
        return numberOfAppendages;
    }

    public void setNumberOfAppendages(int numberOfAppendages) {
        this.numberOfAppendages = numberOfAppendages;
    }
}
