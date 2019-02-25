/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.test.testproject.classes;

/**
 *
 * @author Nimrod
 */
public final class Card {
    
    public static enum Suit {
        SPADE, HEART, DIAMOND, CLUB
    }
    
    public static enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
    
}
