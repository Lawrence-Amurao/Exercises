package com.techelevator.draw.tool;

public class Card {
    //declare the fields - instance variables
    private String suit;
    private String rank;
    private boolean isFaceDown;

    //declare the constructor(s)
    //if I do not declare any constructor, java will provide a default

    //default constructor
    public Card() {
        //this can be empty
        suit = "Spades";
        rank = "Ace";
        isFaceDown = true;
    }

    public Card(String suit, String rank, boolean isFaceDown) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceDown = isFaceDown;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isFaceDown() {
        return isFaceDown;
    }

    public void setFaceDown(boolean faceDown) {
        isFaceDown = faceDown;
    }
}
