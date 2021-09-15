package com.techelevator.draw.tool;

public class CardDemo {

    public static void main(String[] args){
        Card card1 = new Card();

        System.out.println("Suit: " + card1.getSuit());
        System.out.println("Rank: " + card1.getRank());
        System.out.println("Is face down? " + card1.isFaceDown());

        Card card2 = new Card("Hearts", "Ten", false);

        System.out.println("Suit: " + card2.getSuit());
        System.out.println("Rank: " + card2.getRank());
        System.out.println("Is face down? " + card2.isFaceDown());
    }
}
