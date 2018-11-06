package com.sparta.jlb.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffler {

    private Deck deck = new Deck();

    public void shuffle(){
        Collections.shuffle(deck.getDeck());

        for (Card card: deck.getDeck()) {
            System.out.println(card.getValue() + " " + card.getSuit() + "\u0009(" + card.getValue().getValue() + ")");
        }
    }

}
