package com.sparta.jlb.Model;

public class Card {

    private final CardValue cardValue;
    private final String suit;

    public Card( CardValue value, String suit){
        this.cardValue = value;
        this.suit = suit;
    }

    public CardValue getValue() {
        return cardValue;
    }

    public String getSuit() {
        return suit;
    }
}
