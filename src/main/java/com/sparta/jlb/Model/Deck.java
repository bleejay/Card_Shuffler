package com.sparta.jlb.Model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private static List<Card> deck = new ArrayList<>();

    static{
        for (Suits suit: Suits.values()) {
            for (CardValue cardValue : CardValue.values()) {
                Card card = new Card(cardValue, suit.getSymbol());
                deck.add(card);
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }
}
